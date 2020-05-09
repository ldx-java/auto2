package com.tom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myteacher {
    @Bean
    public String shi(){
        return "老师+++";
    }

    @Bean
    public String xue(){
        return "学生+++";
    }

}
