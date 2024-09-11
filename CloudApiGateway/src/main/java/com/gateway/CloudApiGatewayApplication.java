package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiGatewayApplication.class, args);
	}

}

/*
 
 An API Gateway in the context of microservices architecture acts as a single entry point for managing and routing 
 requests to various microservices within an application. It helps to simplify the interaction between clients and 
 microservices by handling tasks such as request routing, load balancing, authentication, and sometimes even response 
 transformation. 

 */