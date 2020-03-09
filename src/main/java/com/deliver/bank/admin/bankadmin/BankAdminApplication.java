package com.deliver.bank.admin.bankadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BankAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAdminApplication.class, args);
	}

}
