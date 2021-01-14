package com.shw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RibbonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonServiceApplication.class, args);
	}

}
