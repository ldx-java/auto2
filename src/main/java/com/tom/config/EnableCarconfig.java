package com.tom.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCar
//@ConditionalOnProperty(name = "hellocar",havingValue = "true")//条件注解
public class EnableCarconfig {
}
