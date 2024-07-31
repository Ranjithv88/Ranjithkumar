package com.spring.boot.ranjith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class RanjithApplication {

	public static void main(String[] args) {
		SpringApplication.run(RanjithApplication.class, args);
	}

@GetMapping("")
}
