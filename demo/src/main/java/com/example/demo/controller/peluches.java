package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.example.demo.repositories.peluchesRepositories;

@Controller
public class peluches {

    private final peluchesRepositories pelR;

    public peluches(peluchesRepositories pelR) {
        this.pelR = pelR;
    }
    @GetMapping("/peluches")
    public String showIndex(Model model) {
        model.addAttribute("title", "cantidad de peluches"+String.valueOf(pelR.count()));
        return "index";
    }
}