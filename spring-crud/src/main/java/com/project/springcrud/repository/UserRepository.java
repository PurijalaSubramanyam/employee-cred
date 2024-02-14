package com.project.springcrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.springcrud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // List<User> getAllUsers();
    // User getUserById(Integer id);
    // User createUser(User user);
    // User updateUser(Integer id, User user);
    // void deleteUser(Integer id);
    // @SuppressWarnings("null")
    // List<User> findAll();
}
