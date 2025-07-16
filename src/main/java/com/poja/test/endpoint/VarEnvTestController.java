package com.poja.test.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VarEnvTestController {

    @GetMapping("/env")
    public String test() {
        String Value = System.getenv("SECRET_KEY");
        return Value;
    }

}
