package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.Role;
import com.project.farmsmart.entities.User;
import com.project.farmsmart.entities.UserDetailsImpl;
import com.project.farmsmart.repository.UserRepository;
import com.project.farmsmart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        List<Role> roles = new ArrayList<>();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        roles.add(new Role(1,"FARMER"));
        user.setRoles(roles);
         userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username);

        if(user == null){
            throw new UsernameNotFoundException("User not available");
        }

        return  UserDetailsImpl.build(user);
    }
}
