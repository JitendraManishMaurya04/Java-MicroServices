package com.mauryaApp.pixlrPicApp.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PixlrPicAppApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PixlrPicAppApiUsersApplication.class, args);
	}

}
