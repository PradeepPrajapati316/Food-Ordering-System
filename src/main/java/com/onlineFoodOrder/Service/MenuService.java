package com.onlineFoodOrder.Service;

import java.util.List;

import com.onlineFoodOrder.entities.Menu;


public interface MenuService {
    List<Menu> getAllItems();
    Menu addItem(Menu item);
    void removeItem(Long itemId);
    Menu getItemById(Long itemId);
}


