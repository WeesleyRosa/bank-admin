package com.deliver.bank.admin.bankadmin.repository;

import com.deliver.bank.admin.bankadmin.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
