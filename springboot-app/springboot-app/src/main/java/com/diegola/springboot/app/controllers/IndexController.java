package com.diegola.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IndexController {

    @GetMapping(value="/inicio")
    public String index(){
        HashMap<String,String> json = new HashMap<>();
        json.put("message","Status ok");
        json.put("data","hola mundo");
        return json.toString();
    }
}
