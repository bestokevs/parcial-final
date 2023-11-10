package com.example.demo.controller;


import com.example.demo.repositories.ropaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class ropa {
    private final ropaRepositories ropR;
    public ropa(ropaRepositories ropR) {
        this.ropR = ropR;
    }
    @GetMapping("/ropa")
    public String showIndex(Model model) {
        model.addAttribute("title", "cantidad de prendas" + String.valueOf(ropR.count()));
        return "index";
    }
}