package com.tech.jacoco.jacocospringboot.services.check;

import org.springframework.stereotype.Component;

@Component
public class JacocoService1 {
    public int service(int a , int b){
        int c = a + b;
        return c;
    }
}
