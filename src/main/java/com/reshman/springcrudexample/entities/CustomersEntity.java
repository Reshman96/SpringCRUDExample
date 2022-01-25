package com.reshman.springcrudexample.entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "customers", schema = "northwindcustomers", catalog = "")
public class CustomersEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "company_name")
    private String companyName;
    @Basic
    @Column(name = "contact_name")
    private String contactName;
    @Basic
    @Column(name = "contact_title")
    private String contactTitle;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "region")
    private String region;
    @Basic
    @Column(name = "postal_code")
    private String postalCode;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "fax")
    private String fax;
    @Basic
    @Column(name = "image")
    private byte[] image;
    @Basic
    @Column(name = "image_thumbnail")
    private byte[] imageThumbnail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getImageThumbnail() {
        return imageThumbnail;
    }

    public void setImageThumbnail(byte[] imageThumbnail) {
        this.imageThumbnail = imageThumbnail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersEntity that = (CustomersEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(companyName, that.companyName) && Objects.equals(contactName, that.contactName) && Objects.equals(contactTitle, that.contactTitle) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(region, that.region) && Objects.equals(postalCode, that.postalCode) && Objects.equals(country, that.country) && Objects.equals(phone, that.phone) && Objects.equals(fax, that.fax) && Arrays.equals(image, that.image) && Arrays.equals(imageThumbnail, that.imageThumbnail);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + Arrays.hashCode(imageThumbnail);
        return result;
    }
}
