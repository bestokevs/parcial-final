package com.example.demo.controller;

import com.example.demo.domain.ropaEntity;
import com.example.demo.repositories.ropaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping( "/api")
public class ropaController {
    private final ropaRepositories ropR;
    @Autowired
    public ropaController(ropaRepositories ropR){
        this.ropR =ropR;
    }
    @GetMapping("/createropa/{id}")
    public String addropa(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "ropa adicionada satisfactoriamente "+id;
    }
    @GetMapping("/createropa")
    public String addropa(){
        return "prenda añadida";
    }
    @GetMapping("/readropa")
    public String readropa(){
        return String.valueOf(ropR.findAll());
    }
    @GetMapping("/readropa/{id}")
    public Optional<ropaEntity> readropa(@PathVariable("id") String identificador){
        String regexforID = "[1-5 a-z]{1,5}";
        if (identificador == null || !identificador.matches(regexforID))
            throw new IllegalArgumentException();
        return ropR.findById(Long.valueOf(identificador));
    }
    @GetMapping("/updateropa")
    public String updateropa(){
        return "prenda actualizada";
    }
    @GetMapping("/deleteropa")
    public String deleteropa(){
        return "prenda eliminada";
    }
}