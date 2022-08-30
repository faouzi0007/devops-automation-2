package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message(){
		return "Salamo 3alaykom 30/08/2022 11:20";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
