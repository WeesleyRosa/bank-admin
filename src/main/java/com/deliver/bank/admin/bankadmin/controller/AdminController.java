package com.deliver.bank.admin.bankadmin.controller;

import com.deliver.bank.admin.bankadmin.service.AdminService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
}