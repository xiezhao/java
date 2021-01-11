package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "dalaoyang");
        return "index";
    }

    @GetMapping(value = "/cookieValue")
    public void getCookieValue(@CookieValue(name = "JSESSIONID") String cookie){
        System.out.println(cookie);
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public void getCookieValue(){
        System.out.println("test");
    }
}
