package com.np.lms_app.service;

import com.np.lms_app.model.User;

public interface UserService {
    void save(User user);
     User findByUsername(String username);
}
