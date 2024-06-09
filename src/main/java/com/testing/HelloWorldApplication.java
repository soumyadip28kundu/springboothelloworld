package com.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "java.com.testing" })
public class HelloWorldApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
