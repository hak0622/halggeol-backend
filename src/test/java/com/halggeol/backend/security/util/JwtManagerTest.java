package com.halggeol.backend.security.util;

import static org.junit.jupiter.api.Assertions.*;

import com.halggeol.backend.global.config.AppConfig;
import com.halggeol.backend.user.dto.UserJoinDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.util.Date;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {AppConfig.class})
@Log4j2
class JwtManagerTest {

    @Autowired
    private JwtManager jwtManager;

    @Test
    void generateVerifyToken() {
        String email = "test@example.com";
        String token = jwtManager.generateVerifyToken(email);
        assertTrue(jwtManager.validateToken(token));
    }

    @Test
    void getEmail() {
        String email = "test@test.com";
        String token = jwtManager.generateAccessToken(email);
        assertEquals(email, jwtManager.getEmail(token));
    }

    @Test
    void validateToken() {
        String token = Jwts.builder()
            .setSubject("")
            .setIssuedAt(new Date())
            .setExpiration(new Date(new Date().getTime() + 3000))
            .signWith(Keys.secretKeyFor(SignatureAlgorithm.HS256))
            .compact();
        assertThrows(Exception.class, () -> {
            jwtManager.validateToken(token);
        });
    }
}