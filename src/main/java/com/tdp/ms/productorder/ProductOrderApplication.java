package com.tdp.ms.productorder;

import com.tdp.genesis.core.starter.web.runner.StarterWebApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.reactive.config.EnableWebFlux;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

/**
 * Clase de inicialización del microservicio.
 * @author Ronald Barón.
 * @version 1.0
 */
@EnableWebFlux
@SpringBootApplication
@EnableSwagger2WebFlux
@EnableConfigurationProperties
public class ProductOrderApplication extends StarterWebApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ProductOrderApplication.class, args);
    }
    
}
