package com.example.demo.controller;

import com.example.demo.domain.personalizadosEntity;
import com.example.demo.repositories.personalizadosRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping( "/api")
public class personalizadosController {
    private final personalizadosRepositories perR;
    @Autowired
    public personalizadosController(personalizadosRepositories perR){
        this.perR =perR;
    }
    @GetMapping("/createpersonalizados/{id}")
    public String addpersonalizados(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "personalizado adicionado satisfactoriamente "+id;
    }
    @GetMapping("/createpersonalizados")
    public String addpersonalizados(){
        return "personalizado añadido";
    }
    @GetMapping("/readpersonalizados")
    public String readpersonalizados(){
        return String.valueOf(perR.findAll());
    }
    @GetMapping("/readpersonalizados/{id}")
    public Optional<personalizadosEntity> readpersonalizados(@PathVariable("id") String identificador){
        String regexforID = "[1-5 a-z]{1,5}";
        if (identificador == null || !identificador.matches(regexforID))
            throw new IllegalArgumentException();
        return perR.findById(Long.valueOf(identificador));
    }
    @GetMapping("/updatepersonalizados")
    public String updatepersonalizados(){
        return "personalizado actualizado";
    }
    @GetMapping("/deletepersonalizados")
    public String deletepersonalizados(){
        return "personalizado eliminado";
    }
}