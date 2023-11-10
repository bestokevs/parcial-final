package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.example.demo.repositories.personalizadosRepositories;

@Controller
public class personalizados {
    private final personalizadosRepositories perR;
    public personalizados(personalizadosRepositories perR) {
        this.perR = perR;
    }
    @GetMapping("/personalizados")
    public String showIndex(Model model) {
        model.addAttribute("title", "cantidad de personalizados"+String.valueOf(perR.count()));
        return "index";
    }
}