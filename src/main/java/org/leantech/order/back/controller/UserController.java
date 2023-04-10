package org.leantech.order.back.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.leantech.order.back.dto.UserDto;
import org.leantech.order.back.service.user.UserService;
import org.springframework.web.bind.annotation.*;

@Log4j2
@AllArgsConstructor
@RestController
public class UserController {

    UserService userService;

    @PostMapping("/create/user")
    public UserDto create(@RequestBody UserDto user) {
        log.info("Create user: {}", user);
        return userService.createUser(user);
    }

    @GetMapping("/get/user/{id}")
    public UserDto getUser(@PathVariable Long id) {
        log.info("Get user by id: {}", id);
        return userService.getUserById(id);
    }

    @GetMapping("/get/user/{name}")
    public UserDto getUser(@PathVariable String name) {
        log.info("Get user by name: {}", name);
        return userService.getUserByName(name);
    }

}
