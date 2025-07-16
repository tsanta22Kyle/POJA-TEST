package com.poja.test.endpoint;

import com.poja.test.service.SecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VarEnvTestController {
    @Autowired
    private SecretService secretService;

    @GetMapping("/env")
    public String test() {
        return secretService.getSecretKey();
    }
}
