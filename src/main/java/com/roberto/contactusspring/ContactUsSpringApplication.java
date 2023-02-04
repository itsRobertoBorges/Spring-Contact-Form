package com.roberto.contactusspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactUsSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactUsSpringApplication.class, args);
        System.out.print("http://localhost:8080/contact");
    }
}
