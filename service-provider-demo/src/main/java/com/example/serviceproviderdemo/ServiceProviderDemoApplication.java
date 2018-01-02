package com.example.serviceproviderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderDemoApplication.class, args);
	}
}
