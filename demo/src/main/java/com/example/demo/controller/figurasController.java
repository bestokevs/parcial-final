package com.example.demo.controller;

import com.example.demo.domain.figurasEntity;
import com.example.demo.repositories.figurasRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping( "/api")
public class figurasController {
    private final figurasRepositories figR;
    @Autowired
    public figurasController(figurasRepositories figR){
        this.figR =figR;
    }
    @GetMapping("/createfiguras/{id}")
    public String addfiguras(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "figura adicionado satisfactoriamente "+id;
    }
    @GetMapping("/createfiguras")
    public String addfiguras(){
        return "figura añadida";
    }
    @GetMapping("/readfiguras")
    public String readfiguras(){
        return String.valueOf(figR.findAll());
    }
    @GetMapping("/readfiguras/{id}")
    public Optional<figurasEntity> readfiguras(@PathVariable("id") String identificador){
        String regexforID = "[1-5 a-z]{1,5}";
        if (identificador == null || !identificador.matches(regexforID))
            throw new IllegalArgumentException();
        return figR.findById(Long.valueOf(identificador));
    }
    @GetMapping("/updatefiguras")
    public String updatefiguras(){
        return "figura actualizada";
    }
    @GetMapping("/deletefiguras")
    public String deletefiguras(){
        return "figura eliminada";
    }
}