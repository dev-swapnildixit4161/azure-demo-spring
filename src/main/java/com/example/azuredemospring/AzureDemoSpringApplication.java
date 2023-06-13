package com.example.azuredemospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoSpringApplication {

	@GetMapping("/hello")
	public String welcome(){
		return "Welcome to Azure you have successfully deployed first application";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoSpringApplication.class, args);
	}

}
