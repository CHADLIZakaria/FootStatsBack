package com.zchadli05.footStatsBack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

@Configuration
public class AuthFootStatsConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Content-Type", "application/json");
            requestTemplate.header("Accept", "application/json");
            requestTemplate.header("x-rapidapi-host", "v3.football.api-sports.io");
            requestTemplate.header("x-rapidapi-key", "2dfcaf92e651c6fd38db780f5c41b13d");
        };
    }
}