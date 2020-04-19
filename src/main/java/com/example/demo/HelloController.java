package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author troyhart
 */
@RestController
@RequestMapping("/")
public class HelloController {

    /**
     * just saying hello.
     * 
     * @return simple greeting
     */
    @GetMapping()
    public String hello() {
        return "hello";
    }
    
}