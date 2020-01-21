package com.test.controller;

import com.test.model.User;
import com.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    @GetMapping(value = {"", "/"}, produces = "json/application")
    List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping(value = "/{id}", produces = "json/application")
    Optional<User> getById(@PathParam("id") int id) {
        return userService.getById(id);
    }

    @PostMapping(value = {"", "/"}, produces = "json/application")
    int createOrUpdate(@RequestBody User newUser) {
        return userService.createOrUpdate(newUser);
    }

    @DeleteMapping(value = "/{id}", produces = "json/application")
    Optional<User> DeleteById(@PathParam("id") int id) {
        return userService.deleteById(id);
    }
}
