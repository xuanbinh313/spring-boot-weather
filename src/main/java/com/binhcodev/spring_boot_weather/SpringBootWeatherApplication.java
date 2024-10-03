package com.binhcodev.spring_boot_weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeatherApplication.class, args);
	}

	@GetMapping("/")
	public String sayHello(){
		return "Hello World";
	}

}
