package com.example.eregisrar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/" ,"/eregistrar" , "/home","/elibrary/home"})
    public String displayHomeScreen(){
        System.out.println("HERE");
        return "home/index";
    }


}
