package com.skills.learning.vaadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class VaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaadinApplication.class, args);
	}
}
