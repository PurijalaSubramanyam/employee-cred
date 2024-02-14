package com.project.springcrud.service;

import java.util.List;
import com.project.springcrud.entity.User;

public interface UserService {
    void addEmployee(User user);
    List<User> getAllUsers(); // Corrected method name
    User getUserById(Integer id); 
    User createUser(User user);
    User updateUser(Integer id, User user); // Add this method to the interface
    String deleteUser(Integer id);
    List<User> getEmployees(); 
}
