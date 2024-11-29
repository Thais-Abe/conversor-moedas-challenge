package com.abe.thais.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoinController {

    @GetMapping("/")
    public String getCoinConverter(){
            return "index";
    }
}
