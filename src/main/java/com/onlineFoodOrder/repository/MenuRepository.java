package com.onlineFoodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineFoodOrder.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    // Additional queries, if needed
}
