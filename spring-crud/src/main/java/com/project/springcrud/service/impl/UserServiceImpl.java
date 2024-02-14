package com.project.springcrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springcrud.entity.User;
import com.project.springcrud.repository.UserRepository;
import com.project.springcrud.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addEmployee(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getEmployees() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(Integer id, User user) {
        User obj = userRepository.findById(id).get();
        if (userRepository.existsById(id)) {

            obj.setName(user.getName());
            obj.setAge(user.getAge());
            obj.setMobile(user.getMobile());
            obj.setWork(user.getWork());
            return userRepository.save(obj); // Update the user
        }
        return obj; // Return null if user does not exist
    }

    @SuppressWarnings("null")
    @Override
    public String deleteUser(Integer id) {
        userRepository.deleteById(id);
        return "Deleted sucessfully";
    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getAllUsers'");
        return userRepository.findAll();

    }
}
