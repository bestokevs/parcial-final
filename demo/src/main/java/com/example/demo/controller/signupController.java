package com.example.demo.controller;

import com.example.demo.constants.LoginCodes;
import com.example.demo.constants.LoginUtils;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repositories.usersRepositories;

import java.util.Map;

@RestController
@RequestMapping("/v1")
public class signupController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> registroUsuario(@RequestBody(required = true)Map<String,String> requestMap){
        try{
            userService.SignUp(requestMap);
            return LoginUtils.getResponseEntity(LoginCodes.SUCCESS, HttpStatus.CREATED);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return LoginUtils.getResponseEntity(LoginCodes.SOMETHING_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
