package com.onlineFoodOrder.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineFoodOrder.Service.MenuService;
import com.onlineFoodOrder.entities.Menu;
import com.onlineFoodOrder.repository.MenuRepository;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getAllItems() {
        return menuRepository.findAll();
    }

    @Override
    public Menu addItem(Menu item) {
        return menuRepository.save(item);
    }

    @Override
    public void removeItem(Long itemId) {
        menuRepository.deleteById(itemId);
    }
    
    @Override
    public Menu getItemById(Long itemId) {
        return menuRepository.findById(itemId).orElse(null);
    }
}

