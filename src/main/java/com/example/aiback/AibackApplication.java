package com.example.aiback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableConfigurationProperties
public class AibackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AibackApplication.class, args);
	}

	@Bean
	public org.springframework.boot.CommandLineRunner seedData(com.example.aiback.service.SeedService seedService) {
		return args -> seedService.seedUsersIfEmpty();
	}
}
