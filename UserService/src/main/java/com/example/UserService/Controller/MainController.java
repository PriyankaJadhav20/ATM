package com.example.UserService.Controller;


import com.example.UserService.Entitiy.Users;
import com.example.UserService.NewVolume.ResponseTemplate;
import com.example.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/users")
public class MainController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUsers(@RequestBody Users users){
        return userService.saveUsers(users);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDetails(@PathVariable("id") Long userId){
        return userService.getUserWithDetails(userId);
    }
}


