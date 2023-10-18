package com.azure.springbootazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureDemoApplication {

	@GetMapping("/hello")
	public String hello(){
		return "Hello World !!";
	}

	@GetMapping("/greet")
	public String greet(){
		return "Good Morning";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureDemoApplication.class, args);
	}

}
