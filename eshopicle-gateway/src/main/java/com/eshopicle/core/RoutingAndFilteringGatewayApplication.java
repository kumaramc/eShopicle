package com.eshopicle.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
class RoutingAndFilteringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingAndFilteringGatewayApplication.class, args);
	}
	
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//	    return builder.routes()
//	        .route(p -> p
//	            .path("/get")
//	            .filters(f -> f.addRequestHeader("Hello", "World"))
//	            .uri("http://httpbin.org:80"))
//	        .build();
//	}

}
