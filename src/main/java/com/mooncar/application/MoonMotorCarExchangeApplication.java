package com.mooncar.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mooncar")
public class MoonMotorCarExchangeApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MoonMotorCarExchangeApplication.class);
	}


	public static void main(String[] args) throws Exception {
		
		// Work in progress
		
		
		SpringApplication.run(MoonMotorCarExchangeApplication.class, args);
	}
}
