package com.example.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public String devMessage() {
        return "Running in DEV profile";
    }

    @Bean
    @Profile("prod")
    public String prodMessage() {
        return "Running in PROD profile";
    }
}
