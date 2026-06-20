package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repo;

    public UserService(UserRepository repo) {

        this.repo = repo;

    }

    public void save(User user) {

        repo.save(user);

    }

    public Optional<User> find(Integer id) {

        return repo.findById(id);

    }

    public List<User> findAll() {

        return repo.findAll();

    }

}