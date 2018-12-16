package com.tech.jacoco.jacocospringboot.services;

import org.springframework.stereotype.Component;

@Component
public class JacocoService {

    public int service(int a , int b){
        int c = a + b;
        return c;
    }

}
