package com.tom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mycar {
    @Bean
    public String  bao(){
        return "汽车--------";
    }
}
