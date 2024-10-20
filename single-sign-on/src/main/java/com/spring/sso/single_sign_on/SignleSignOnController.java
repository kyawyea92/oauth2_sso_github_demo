package com.spring.sso.single_sign_on;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignleSignOnController {

    @GetMapping("/api/demo")
    public String protectedApi() {
        return "Hello, this is a protected API endpoint.";
    }
}
