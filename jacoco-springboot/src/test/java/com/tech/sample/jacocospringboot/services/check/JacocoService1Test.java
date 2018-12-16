package  com.tech.sample.jacocospringboot.services.check;


import com.tech.jacoco.jacocospringboot.services.check.JacocoService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class JacocoService1Test {

    JacocoService1 jacocoService1 = new JacocoService1();

    @Test
    public void jacocoService() throws Exception {
        System.out.println("Hello Service");
        int output = jacocoService1.service(1, 2);
        assert output == 3;
    }



}