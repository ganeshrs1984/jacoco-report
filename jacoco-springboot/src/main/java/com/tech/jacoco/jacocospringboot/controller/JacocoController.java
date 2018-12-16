package com.tech.jacoco.jacocospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/jacoco/hello")
public class JacocoController {

    @GetMapping
    public  String hello(){
        return "hello world";
    }
}
