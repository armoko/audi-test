package com.audi.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AudiApplication.class, args);
	}

}
