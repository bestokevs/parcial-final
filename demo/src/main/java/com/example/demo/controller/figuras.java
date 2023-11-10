package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.example.demo.repositories.figurasRepositories;

@Controller
public class figuras {

    private final figurasRepositories figR;

    public figuras(figurasRepositories figR) {
        this.figR = figR;
    }
    @GetMapping("/figuras")
    public String showIndex(Model model) {
        model.addAttribute("title", "cantidad figuras " +String.valueOf(figR.count()));
        return "index";
    }
}