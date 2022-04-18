package com.kruger.vaccinationinventoryback.presentation.controller;


import com.kruger.vaccinationinventoryback.presentation.presenter.UserPresenter;
import com.kruger.vaccinationinventoryback.service.UserService;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Generated
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/loginUser")
    public UserPresenter loginUser(@RequestParam("username") String username,
                                   @RequestParam("password") String password) {
        return userService.loginUser(username, password);

    }
}
