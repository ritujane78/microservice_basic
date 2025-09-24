package com.jane.ws.api.ResourceServer.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/token")
public class TokenController {
    @GetMapping
    public Object getToken(@AuthenticationPrincipal Jwt jwt){
//        return Collections.singletonMap("Principal", jwt);
        return jwt;
    }
}
