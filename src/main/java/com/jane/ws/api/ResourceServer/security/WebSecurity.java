//package com.jane.ws.api.ResourceServer.security;
//
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
//
//@EnableWebSecurity
//public class WebSecurity extends WebSecurityConfigurerAdapter{
//    @Override
//    public void configure(HttpSecurity http) throws Exception{
//        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
//        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new KeycloakConverter());
//        http
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET,"/users/status/check")
//                .hasRole("developers")
//                .anyRequest().authenticated()
//                .and()
//                .oauth2ResourcesServer()
//                .jwt()
//                .jwtAuthenticationConverter(jwtAuthenticationConverter)
//    }
//
//}
