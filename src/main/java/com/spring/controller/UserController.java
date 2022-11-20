package com.spring.controller;

import com.spring.dto.UserLocationDTO;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users-locations")
    public ResponseEntity<List<UserLocationDTO>> getAllUsersLocations(){

        return ResponseEntity.ok(userService.getAllUsersLocations());
    }
}
