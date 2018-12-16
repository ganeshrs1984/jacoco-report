package com.tech.sample.jacocospringboot.services;

import com.tech.jacoco.jacocospringboot.services.JacocoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class JacocoServiceTest {

    JacocoService jacocoService = new JacocoService();

    @Test
    public void jacocoService() throws Exception {
        System.out.println("Hello Service");
        int output = jacocoService.service(1, 2);
        assert output == 3;
    }



}