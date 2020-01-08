package com.guier.ad.sponsor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCircuitBreaker
@SpringBootApplication
@EnableScheduling
@EnableFeignClients(basePackages = {"com.guier.ad.*"})
@ComponentScan(basePackages = {"com.guier.ad.*"})
@EnableJpaRepositories(basePackages = {"com.guier.ad.*"})
@EntityScan(basePackages = {"com.guier.ad.*"})
public class AdSponsorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdSponsorApplication.class);
    }
}

