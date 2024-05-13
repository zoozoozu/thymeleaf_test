package com.zoozoozu.dunrin.controller;

import com.zoozoozu.dunrin.model.User;
import com.zoozoozu.dunrin.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping("/api")
public class UserApiController {

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/users")
    List<User> all(@RequestParam(required = false) String method,
            @RequestParam(required = false, defaultValue = "") String text){
        List<User> users = null;
        if("query".equals(method)){
            users = userRepository.findByUsernameQuery(text);
        }else if("nativeQuery".equals(method)){
            users = userRepository.findByUsernameNativeQuery(text);
        }else if("querydsl".equals(method)){
            Predicate predicate;
        }
        else{
            users = userRepository.findAll();
        }
        return users;
    }
}
