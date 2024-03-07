package com.onlineFoodOrder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineFoodOrder.Service.MenuService;
import com.onlineFoodOrder.entities.Menu;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> getAllItems() {
        return menuService.getAllItems();
    }
    
    @PostMapping
    public Menu addItem(@RequestBody Menu item) {
        return menuService.addItem(item);
    }

    @DeleteMapping("/{itemId}")
    public void removeItem(@PathVariable Long itemId) {
        menuService.removeItem(itemId);
    }
}

