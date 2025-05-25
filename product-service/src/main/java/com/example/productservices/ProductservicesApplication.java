package com.example.productservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductservicesApplication.class, args);
	}

}
