package com.bank.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator createRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("bank-service-route",route->route.path("/api/banks/**")
                        .uri("http://localhost:8081")).build();

    }
}
