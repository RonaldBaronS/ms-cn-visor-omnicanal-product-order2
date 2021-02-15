package com.tdp.ms.productorder.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import com.tdp.ms.commonsvisor.controller.ExceptionController;
import com.tdp.ms.commonsvisor.rest.RestOP;
import com.tdp.ms.commonsvisor.rest.header.HeaderOP;

import lombok.Getter;

/**
 * Configuracion del microservicio.
 * @author Jorge Ponce.
 * @version 1.0.
 */
@RefreshScope
@Configuration
@Getter
public class MicroserviceConfig {
    
    /*@Value("${microservices.errores.url}")
    private String catalogoErrores;
    
    @Value("${microservices.errores.id}")
    private String tokenCatalogoErrores;
    /**
     * Metodo para crear el RestOP: Catalogo Errores.
     */
    /*@Bean
    public RestOP rest() {
        return new RestOP(catalogoErrores, HeaderOP.add("request-id", tokenCatalogoErrores),
                HeaderOP.add("request-date", new Date().toString()));
    }
    /**
     * Metodo para crear el RestOP: Catalogo Errores.
     */
   /* @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public ExceptionController exceptionController() {
        return new ExceptionController(rest());
    }*/

}
