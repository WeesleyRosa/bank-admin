package com.deliver.bank.admin.bankadmin.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {

    @Id
    private Long adminId;
    private String name;
    private String address;
    private String identifier;
    private String password;
    private String email;
    private String phoneNumber;

    public Admin(){}

    public Admin(Long adminId, String name, String address, String identifier, String password, String email, String phoneNumber) {
        this.adminId = adminId;
        this.name = name;
        this.address = address;
        this.identifier = identifier;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}