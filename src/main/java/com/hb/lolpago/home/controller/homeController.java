package com.hb.lolpago.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getChampsName(){
        
        List<String> = 

        return "home";
    }
}
