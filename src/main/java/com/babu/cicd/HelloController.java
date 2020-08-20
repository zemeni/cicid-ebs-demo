package com.babu.cicd;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloController {

    public String hello() {
        return "hello youtuber";
    }
}
