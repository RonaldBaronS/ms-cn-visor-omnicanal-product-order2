package com.tdp.ms.productorder;

//import com.tdp.ms.productorder.business.repository.ProductOrderDao;
import com.tdp.ms.productorder.business.repository.impl.ProductOrderDaoImplAux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
@ComponentScan(excludeFilters = @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {}))
public class TestingConfiguration {
    
   /* @Bean
    @Primary
    public ProductOrderDao productOrderDao() {
        return new ProductOrderDaoImplAux();
    }
    
    @Bean
    @Primary
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http.csrf().disable().authorizeExchange().anyExchange().permitAll();
        return http.build();
    }*/
    
}
