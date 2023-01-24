package com.example.insta_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:jasypt.properties"})
public class InstaCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstaCloneApplication.class, args);
	}

}
