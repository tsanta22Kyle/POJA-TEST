package com.poja.test.varenv;

import com.poja.test.conf.FacadeIT;
import com.poja.test.service.SecretService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;



public class SimpleVarEnvTest extends FacadeIT {

    @Autowired
    private SecretService subject;

    @Test
    public void test() {
        String expectedKey = "sk_preprod_test";
        String actualKey = subject.getSecretKey();
        Assertions.assertEquals(
                expectedKey, actualKey);
    }


}
