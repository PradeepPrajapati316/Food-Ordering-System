package com.onlineFoodOrder.Service;

import com.onlineFoodOrder.entities.Admin;

public interface AdminService {
    Admin createAdmin(Admin admin);
    Admin getAdminByUsername(String username);
}


