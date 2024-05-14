package com.linkedin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.linkedin.models")
@ComponentScan({"com.linkedin.controllers"})
public class LinkedinApplication {
	public static void main(String[] args) {
		SpringApplication.run(LinkedinApplication.class, args);
	}

}
