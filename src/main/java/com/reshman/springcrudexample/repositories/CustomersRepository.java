package com.reshman.springcrudexample.repositories;

import com.reshman.springcrudexample.entities.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<CustomersEntity, String> {

}
