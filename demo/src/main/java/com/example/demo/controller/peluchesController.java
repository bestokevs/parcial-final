package com.example.demo.controller;

import com.example.demo.domain.peluchesEntity;
import com.example.demo.repositories.peluchesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping( "/api")
public class peluchesController {
    private final peluchesRepositories pelR;
    @Autowired
    public peluchesController(peluchesRepositories pelR){
        this.pelR =pelR;
    }
    @GetMapping("/createpeluches/{id}")
    public String addpeluches(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "peluche adicionado satisfactoriamente "+id;
    }
    @GetMapping("/createpeluches")
    public String addpeluches(){
        return "peluche añadido";
    }
    @GetMapping("/readpeluches")
    public String readpeluches(){
        return String.valueOf(pelR.findAll());
    }
    @GetMapping("/readpeluches/{id}")
    public Optional<peluchesEntity> readpeluches(@PathVariable("id") String identificador){
        String regexforID = "[1-5 a-z]{1,5}";
        if (identificador == null || !identificador.matches(regexforID))
            throw new IllegalArgumentException();
        return pelR.findById(Long.valueOf(identificador));
    }
    @GetMapping("/updatepeluches")
    public String updatepeluches(){
        return "personalizado actualizado";
    }
    @GetMapping("/deletepeluches")
    public String deletepeluches(){
        return "peluche eliminado";
    }
}