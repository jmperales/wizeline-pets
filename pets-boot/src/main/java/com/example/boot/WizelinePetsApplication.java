package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.example",
		"com.example.domain.repository",
		"com.example.adapters.repository",
		"com.example.adapters"})
@EnableJpaRepositories("com.example.adapters.repository")
@EntityScan("com.example.adapters.model")
public class WizelinePetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WizelinePetsApplication.class, args);
	}

}
