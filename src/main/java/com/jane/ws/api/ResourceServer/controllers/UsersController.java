package com.jane.ws.api.ResourceServer.controllers;

import com.jane.ws.api.ResourceServer.responses.UserRest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status/check")
    public String status(){
        return "Working...";
    }

    @PreAuthorize("hasRole('developer') or #id == #jwt.subject" )
//    @PreAuthorize("hasAuthority('ROLE_developer')")
    @Secured("ROLE_developer")
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt){
        return "User deleted with id: " + id + " and jwt subject: " + jwt.getSubject();
    }
    @PostAuthorize("returnObject.id == #jwt.subject" )
//    @PreAuthorize("hasAuthority('ROLE_developer')")
    @Secured("ROLE_developer")
    @GetMapping("/{id}")
    public UserRest getUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt){
        return new UserRest("8af74e98-5467-459c-9a63-1888e7be1785","Ritu", "Bafna");
    }
}
