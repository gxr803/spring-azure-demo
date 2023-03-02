package com.example.springserviceazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringserviceAzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringserviceAzureDemoApplication.class, args);
	}

	@GetMapping("/message")
	public String message(){
		return "Congratulation Your Application is up & running !";
	}
}
