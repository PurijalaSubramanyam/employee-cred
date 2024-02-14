package com.project.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Correct import statement

import com.project.springcrud.entity.User;
import com.project.springcrud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/show")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @GetMapping("/{id}/get")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
    
    @PostMapping ("/add")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    
    @PutMapping("/{id}/update")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
    
    @DeleteMapping("/{id}/delete")
    public String deleteUser(@PathVariable Integer id) {
       return userService.deleteUser(id);
    }
    @GetMapping("/hi") 
    public String welcome () {
        return "hii this is test";
    }
}