package com.vp.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * Netflix Eureka server Spring Cloud API
 * service registry and discovery server.
 * https://howtodoinjava.com/spring-cloud/spring-cloud-service-discovery-netflix-eureka/
 * @author vijpande
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }
}
