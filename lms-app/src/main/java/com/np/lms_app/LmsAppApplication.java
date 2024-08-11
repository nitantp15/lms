package com.np.lms_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:custom.properties")
public class LmsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsAppApplication.class, args);
	}

}
