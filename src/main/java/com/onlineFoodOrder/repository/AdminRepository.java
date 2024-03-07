package com.onlineFoodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineFoodOrder.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
