package com.tdp.ms.productorder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.tdp.ms.commonsvisor.exception.GeneralTdpException;
import com.tdp.ms.productorder.business.dto.ProductOrderDto;
//import com.tdp.ms.productorder.business.interactors.BuscarArea;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureWebTestClient
@ImportAutoConfiguration(classes = TestingConfiguration.class)
@TestPropertySource(properties = { "application.bd_mongo.username=visor-test", 
        "application.bd_mongo.password=visor-test",
        "application.bd_mongo.url=localhost", 
        "application.bd_mongo.port=27017",
        "application.bd_mongo.nombre_db=visordb",
        "application.bd_mongo.ssl=false",
        "application.bd_mongo.timeConnection=60000",
        "microservices.errores.url=https://aks-visor-ingress-cert.eastus2.cloudapp.azure.com/",
        "microservices.errores.id=2" })
@Slf4j
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class ProductOrderApplicationTest {
    
   /* @Autowired
    private WebTestClient webClient;
    
    @Autowired
    private BuscarArea buscarArea;
    
    /*@Test
    public void buscarAreaTest() {
        log.info("ProductOrderApplicationTest.buscarAreaTest");
        buscarArea.setAreaId("VISOR");
        ProductOrderDto dto = buscarArea.ejecutar();
        assertNotNull(dto);
    }
    
    @Test
    public void buscarAreaNoExisteTest() {
        log.info("ProductOrderApplicationTest.buscarAreaNoExisteTest");
        Assertions.assertThrows(GeneralTdpException.class, () -> {
            buscarArea.setAreaId("VISOR 01");
            buscarArea.ejecutar();
        });
    }
    
    @Test
    public void buscarAreaUriTest() {
        log.info("ProductOrderApplicationTest.buscarAreaUriTest");
        webClient.get()
        .uri("/productOrder/v1/area/VISOR")
        .header("UNICA-ServiceId","550e8400-e29b-41d4-a716-446655440001")
        .header("UNICA-Application","VISOR")
        .header("UNICA-PID","550e8400-e29b-41d4-a716-446655440001")
        .header("UNICA-User", "VISOR")
        .exchange()
        .expectStatus().isOk();
    }*/
    
}
