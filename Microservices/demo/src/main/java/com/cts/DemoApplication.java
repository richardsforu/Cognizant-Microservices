package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.service.TestService;

@SpringBootApplication
public class DemoApplication {
	

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DemoApplication.class, args);
		TestService ts=ac.getBean(TestService.class);
		ts.test();
	}
}
