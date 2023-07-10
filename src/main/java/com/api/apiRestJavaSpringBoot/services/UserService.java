package com.api.apiRestJavaSpringBoot.services;

import com.api.apiRestJavaSpringBoot.models.Users;
import com.api.apiRestJavaSpringBoot.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(Users user) {
        userRepository.save(user);
    }

    // Otros métodos relacionados con la lógica de negocio
}

