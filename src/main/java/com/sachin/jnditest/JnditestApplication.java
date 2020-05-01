package com.sachin.jnditest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JnditestApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(JnditestApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JnditestApplication.class);
    }
	

}
