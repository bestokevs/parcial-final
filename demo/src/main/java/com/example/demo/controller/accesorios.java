package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.example.demo.repositories.accesoriosRepositories;

@Controller
public class accesorios {

    private final accesoriosRepositories accR;

    public accesorios(accesoriosRepositories accR) {
        this.accR = accR;
    }
    @GetMapping("/accesorios")
    public String showIndex(Model model) {
        model.addAttribute("title", "cantidad de accesorios "+String.valueOf(accR.count()));
        return "index";
    }
}