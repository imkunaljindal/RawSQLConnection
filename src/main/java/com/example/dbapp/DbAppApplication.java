package com.example.dbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class DbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbAppApplication.class, args);
	}

}
