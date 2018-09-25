package com.mybank.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/index.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "redirect:/index.html";
    }
}
