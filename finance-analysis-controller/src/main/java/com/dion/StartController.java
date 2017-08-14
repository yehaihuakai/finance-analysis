package com.dion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
@ServletComponentScan
@ComponentScan("com.dion")
@Configuration
//@ImportResource({"classpath:urule-console-context.xml"})
public class StartController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartController.class, args);
    }
}

/*
@SpringBootApplication
@ServletComponentScan
@ComponentScan("com.dion")
//@PropertySource(value = {"classpath:config.properties"})
public class StartController extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(StartController.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}*/
