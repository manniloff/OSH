package com.test.service;

import com.test.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();

    Optional<User> getById(int id);

    int createOrUpdate(User newUser);

    Optional<User> deleteById(int id);
}
