package com.yudaodemo.resource.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public Authentication info(Authentication authentication) {
        return authentication;
    }

}