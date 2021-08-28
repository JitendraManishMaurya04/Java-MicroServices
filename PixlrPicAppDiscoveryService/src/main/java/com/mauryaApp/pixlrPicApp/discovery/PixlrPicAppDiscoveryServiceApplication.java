package com.mauryaApp.pixlrPicApp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PixlrPicAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PixlrPicAppDiscoveryServiceApplication.class, args);
	}

}
