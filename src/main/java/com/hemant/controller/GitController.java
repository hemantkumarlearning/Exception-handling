package com.hemant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git/")
public class GitController {

    @GetMapping
    public String GetGit(){
        return "Hello from git";
    }
    @GetMapping("/hello")
    public String Git(){
        return "Hello again git";
    }
    @GetMapping("/greet")
    public String Greet(){
        return "Hello again greet";
    }
}
