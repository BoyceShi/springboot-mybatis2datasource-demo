package com.shibofu.spring.controller;

import com.shibofu.spring.db1.service.UserService;
import com.shibofu.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author potter.fu
 * @date 2018-12-07 15:38
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public User testQuery() {
        User user = userService.selectUserByName("Daisy");
        return user;
    }
}
