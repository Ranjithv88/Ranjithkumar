package com.spring.boot.ranjith01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@SpringBootApplication
public class Ranjith01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ranjith01Application.class, args);
	}

	@GetMapping
	public static String test(){
		return "ranjith02";
	}
}

