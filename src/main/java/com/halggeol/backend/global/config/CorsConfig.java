package com.halggeol.backend.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Value("${cors.allowed-origins}")
    private String allowedOrigins;
    // CORS 설정을 위한 빈을 정의합니다.
    // 현재는 빈이 비어 있지만, 필요에 따라 CORS 설정을 추가할 수 있습니다.
    // 예를 들어, WebMvcConfigurer를 구현하여 CORS 매핑을 추가할 수 있습니다.
    // 추후에 CORS 설정이 필요할 경우, 아래와 같이 구현할 수 있습니다.

    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(allowedOrigins.replace(" ", "").split(",")) // 모든 출처 허용
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
                        .allowCredentials(true); // 자격 증명 허용
            }
        };
    }
}
