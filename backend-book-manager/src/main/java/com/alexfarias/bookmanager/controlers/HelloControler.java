package com.alexfarias.bookmanager.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloControler {
    
    @GetMapping()
    public @ResponseBody String hello(){
        return "hello world";
    }
}
