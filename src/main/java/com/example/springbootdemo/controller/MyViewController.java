package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class MyViewController {

    @RequestMapping("/hello")
    public String index(Map<String, Object> model){
        model.put("time", new Date());
        return "hello";
    }
}
