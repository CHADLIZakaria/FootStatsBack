package com.zchadli05.footStatsBack.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Value("${CORS_URL}")
    private String corsUrl;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println(corsUrl);
        registry
            .addMapping("/**")
            .allowedOrigins(corsUrl)
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowedHeaders("*")
            .allowCredentials(true);
    }
}