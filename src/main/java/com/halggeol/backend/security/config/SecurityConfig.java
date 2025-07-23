package com.halggeol.backend.security.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

@Configuration
@EnableWebSecurity
@Log4j2
//@MapperScan(basePackages = {"com.halggeol.backend.security.account.mapper"})
@ComponentScan(basePackages = {"com.halggeol.backend.security"})
@RequiredArgsConstructor
public class SecurityConfig {
    @Bean
    public Argon2PasswordEncoder passwordEncoder() { return new  Argon2PasswordEncoder(); }

}
