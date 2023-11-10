package com.example.demo.constants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
public class LoginUtils {

    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpstatus){
        return new ResponseEntity<String>("Mensaje: "+message, httpstatus);
    }
}
