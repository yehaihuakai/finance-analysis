package com.dion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@ServletComponentScan
@ComponentScan("com.dion")
//@PropertySource(value = {"classpath:config.properties"})
public class StartController extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(StartController.class, args);

    }

    //指定源文件,进行加载
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
