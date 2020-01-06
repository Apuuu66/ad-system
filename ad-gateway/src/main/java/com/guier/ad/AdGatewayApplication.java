package com.guier.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer
@SpringBootApplication
public class AdGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdGatewayApplication.class);
    }
}
