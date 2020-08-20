package com.babu.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello youtuber";
    }
}
