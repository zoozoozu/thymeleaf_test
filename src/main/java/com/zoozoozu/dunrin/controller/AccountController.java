package com.zoozoozu.dunrin.controller;

import com.zoozoozu.dunrin.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/login")
    public String login(){
        return "/account/login";
    }

    @PostMapping("/register")
    public String register(User user){
        return "/account/register";
    }
}
