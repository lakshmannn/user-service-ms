package com.user.controller;

import com.user.model.User;
import com.user.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody User user) {
        return new ResponseEntity<>(repo.save(user),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Object> getAllUsers() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }
}
