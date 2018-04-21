package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class MyViewController {

    @GetMapping("/hello")
    public String index(Map<String, Object> model){
        model.put("time", new Date());
        return "hello";
    }

}
