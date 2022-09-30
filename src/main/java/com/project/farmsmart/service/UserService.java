package com.project.farmsmart.service;

import com.project.farmsmart.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService extends UserDetailsService {
    void saveUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUserById(Long id);


}
