package com.mybank.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Cache-control", "no-cache,no-store,must-revalidate asdf");
        return "/Login_v2/Login_v2/index";
    }
}
