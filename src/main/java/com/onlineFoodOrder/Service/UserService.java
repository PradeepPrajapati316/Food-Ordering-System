package com.onlineFoodOrder.Service;

import com.onlineFoodOrder.entities.User;

public interface UserService {
    User createUser(User user);
    User getUserByUsername(String username);
}

