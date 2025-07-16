package com.poja.test.varenv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SimpleVarEnvTest {

    @Test
    public void test() {
        String expectedKey = "sk_preprod_test";
        String actualKey = System.getenv("SECRET_KEY");

        Assertions.assertNotEquals(
                expectedKey, actualKey);
    }


}
