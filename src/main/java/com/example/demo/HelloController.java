package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author troyhart
 */
@RestController
@RequestMapping("/")
public class HelloController {

    private static final List<String> greetings = new ArrayList<>();
    {
        greetings.add("hello");
        greetings.add("bonjour");
        greetings.add("hola");
        greetings.add("howdy");
        greetings.add("Hello SLC");
    }

    /**
     * just saying hello.
     * 
     * @return simple greeting
     */
    @GetMapping()
    public String hello(@RequestParam(required = false, defaultValue = "0") int index) {
        if (index < 0 || index >= greetings.size()) {
            // set index to last element if given value is equal to the size of the list
            // otherwise set the index to zero.
            index = index == greetings.size() ? index - 1 : 0;
        }
        return greetings.get(index);
    }

}