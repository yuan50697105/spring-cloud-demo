package com.example.micserviceregistoerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicserviceRegistoerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicserviceRegistoerDemoApplication.class, args);
	}
}
