package com.tom.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(com.tom.config.Myteacher.class)
public @interface EnableTeacher {

}
