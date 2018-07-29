package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/")
    String home() {
        return "hello";
    }

    @RequestMapping("/json_data")
    @ResponseBody
    public String json() {
        String json = "[{ \"code\": \"2323\",\"name\": \"Google\"  }]";
        return json;
    }

}
