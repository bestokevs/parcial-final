package com.example.demo.service.impl;

import com.example.demo.constants.LoginCodes;
import com.example.demo.constants.LoginUtils;
import com.example.demo.domain.userEntity;
import com.example.demo.repositories.usersRepositories;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

import java.util.Map;
import java.util.Objects;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private usersRepositories UserDao;
    @Override
    public ResponseEntity<String> SignUp(Map<String, String> requestMap) {
        log.info("Registro de usuario {}",requestMap);
        try{
            if(validateSignUpMap(requestMap)){
                userEntity user = UserDao.findByEmail(requestMap.get("email"));
                if(Objects.isNull(user)){
                    UserDao.save(getUserFromMap(requestMap));
                    return LoginUtils.getResponseEntity(LoginCodes.SUCCESS, HttpStatus.CREATED);
                }else{
                    return LoginUtils.getResponseEntity("Usuario ya existe!!", HttpStatus.CREATED);
                }
            }else{
                return LoginUtils.getResponseEntity(LoginCodes.INVALID_DATA, HttpStatus.BAD_REQUEST);
            }
        }catch(Exception exception){
            exception.printStackTrace();
        }
        return LoginUtils.getResponseEntity(LoginCodes.INVALID_DATA, HttpStatus.BAD_REQUEST);
    }

    private boolean validateSignUpMap(Map<String,String> requestMap){
        if(requestMap.containsKey("nombre") && requestMap.containsKey("email") && requestMap.containsValue("status") && requestMap.containsValue("password") && requestMap.containsValue("role")){
            return true;
        }else{
            return false;
        }
    }

    private userEntity getUserFromMap(Map<String,String> requestMap){
        userEntity User = new userEntity();
        User.setName(requestMap.get("nombre"));
        User.setEmail(requestMap.get("email"));
        User.setPassword(requestMap.get("password"));
        User.setStatus(requestMap.get("status"));
        User.setRole(requestMap.get("role"));
        return User;
    }
}
