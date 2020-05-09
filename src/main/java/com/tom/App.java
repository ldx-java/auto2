package com.tom;


import com.tom.config.Mycar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
@ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })

public class App {
    @Bean
    public String hello(){
        return "hello";
    }
    public static void main( String args[]) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(App.class).web(WebApplicationType.NONE).run(args);
        JdbcTemplate jdbc = context.getBean("jdbcTemplate",JdbcTemplate.class);
        System.out.println("jdbc"+jdbc);
        String car = context.getBean("bao",String.class);
        System.out.println("car=="+car);
        String tea = context.getBean("shi",String.class);
        System.out.println("teacher----"+tea);
    }

    }
