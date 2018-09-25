package com.mybank.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Cache-control", "no-cache,no-store,must-revalidate asdf");
        return "/Login_v2/index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String index() {
        return "/sign-up-form/index";
    }
}
