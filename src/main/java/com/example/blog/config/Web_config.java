package com.example.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
    @Configuration
    public class Web_config implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOriginPatterns("http://localhost:63342/")
                    .allowedMethods("POST", "GET", "PUT", "DELETE", "OPTIONS","PATCH")
                    .allowedHeaders("*")
                    .allowCredentials(true);
        }
    }

