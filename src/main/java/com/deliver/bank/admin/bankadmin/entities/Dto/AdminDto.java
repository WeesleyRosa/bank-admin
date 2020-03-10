package com.deliver.bank.admin.bankadmin.entities.Dto;

public class AdminDto {

    private Long adminId;
    private String name;
    private String address;
    private String identifier;
    private String email;
    private String phoneNumber;

    public AdminDto(){}

    public AdminDto(Long adminId, String name, String address, String identifier, String email, String phoneNumber) {
        this.adminId = adminId;
        this.name = name;
        this.address = address;
        this.identifier = identifier;
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
