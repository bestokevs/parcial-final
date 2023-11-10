package com.example.demo.controller;

import com.example.demo.domain.accesoriosEntity;
import com.example.demo.repositories.accesoriosRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping( "/api")
public class accesoriosController {
    private final accesoriosRepositories accR;
    @Autowired
    public accesoriosController(accesoriosRepositories accR){
        this.accR =accR;
    }
    @GetMapping("/createAccesorios/{id}")
    public String addAccesorios(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "accesorio adicionado satisfactoriamente "+id;
    }
    @GetMapping("/createAccesorios")
    public String addAccesorios(){
        return "Accesorio añadido";
    }

    @GetMapping("/readAccesorios")
    public String reasaccesorios(){
        return String.valueOf(accR.findAll());
    }
    @GetMapping("/readAccesorios/{id}")
    public Optional<accesoriosEntity> readAccesorios(@PathVariable("id") String identificador){
        String regexforID = "[1-5 a-z]{1,5}";
        if (identificador == null || !identificador.matches(regexforID))
            throw new IllegalArgumentException();
        return accR.findById(Long.valueOf(identificador));
    }
    @GetMapping("/updateAccesorios")
    public String updateAccesorios(){
        return "Accesorio actualizado";
    }

    @GetMapping("/deleteAccesorios")
    public String deleteAccesorios(){
        return "Accesorio eliminado";
    }
}