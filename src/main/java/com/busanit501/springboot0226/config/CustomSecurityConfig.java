package com.busanit501.springboot0226.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Log4j2
@RequiredArgsConstructor
public class CustomSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        log.info("CustomSecurityConfig : SecurityFilterChain, 스프링 시작시, 검사를 한다. ");

        return http.build();
    }
}
