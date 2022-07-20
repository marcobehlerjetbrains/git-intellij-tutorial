package com.example.gitintellijtutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}
