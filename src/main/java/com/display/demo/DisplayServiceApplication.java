package com.display.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.display.controllers")
public class DisplayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayServiceApplication.class, args);
	}

}
