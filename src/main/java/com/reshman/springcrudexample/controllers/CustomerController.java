package com.reshman.springcrudexample.controllers;

import com.reshman.springcrudexample.entities.CustomersEntity;
import com.reshman.springcrudexample.repositories.CustomersRepository;
import com.reshman.springcrudexample.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class CustomerController {
    private final CustomersRepository customersRepository;
    private final CustomerService customerService = new CustomerService();

    @Autowired
    public CustomerController(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @GetMapping("/customers")
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", customersRepository.findAll());
        return "customers";
    }

    @GetMapping("/add-customer")
    public String addCustomer(Model model) {
        CustomersEntity customersEntity = new CustomersEntity();
        model.addAttribute("customer", customersEntity);
        return "add-customer";
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@ModelAttribute("customer") CustomersEntity customersEntity) {
        customersRepository.save(customersEntity);
        return "saved-customer";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") String id) {
        CustomersEntity customersEntity = customersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Customer ID: " + id));
        customersRepository.delete(customersEntity);
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable("id") String id, Model model) {
        CustomersEntity customersEntity = customersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Customer ID: " + id));
        model.addAttribute("customer", customersEntity);
        return "edit-customer";
    }

    @PostMapping("/update-customer/{id}")
    public String updateCustomer(@ModelAttribute("customer") CustomersEntity updatedCustomer,
                                 @PathVariable("id") String id) {
        CustomersEntity customersEntity = customersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Customer ID: " + id));
        customerService.update(updatedCustomer, customersEntity);
        customersRepository.save(customersEntity);

        return "index";
    }

    @GetMapping("/search-customer")
    public String searchForCustomer() {
        return "search-customer";
    }

    @PostMapping("/search-results")
    public String getSearchResults(@ModelAttribute("customerName") String customerName, Model model) {
        ArrayList<CustomersEntity> foundCustomers = new ArrayList<>();
        for (CustomersEntity customersEntity : customersRepository.findAll()) {
            if (customersEntity.getContactName().contains(customerName)) {
                foundCustomers.add(customersEntity);
            }
        }
        model.addAttribute("searchResults", foundCustomers);
        return "search-results";
    }

    @GetMapping("/access-denied")
    public String getAccessDeniedPage() {
        return "access-denied";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "index";
    }
}
