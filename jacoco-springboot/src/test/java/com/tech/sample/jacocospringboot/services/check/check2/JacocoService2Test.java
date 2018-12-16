package  com.tech.sample.jacocospringboot.services.check.check2;

import com.tech.jacoco.jacocospringboot.services.check.check2.JacocoService2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class JacocoService2Test {

    JacocoService2 jacocoService2 = new JacocoService2();

    @Test
    public void jacocoService() throws Exception {
        System.out.println("Hello Service");
        int output = jacocoService2.service(1, 2);
        assert output == 3;
    }



}