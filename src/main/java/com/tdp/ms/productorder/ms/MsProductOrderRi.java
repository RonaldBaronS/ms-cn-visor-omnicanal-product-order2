package com.tdp.ms.productorder.ms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.tdp.ms.commonsvisor.Utilitarios;
import com.tdp.ms.commonsvisor.adapters.Mapper;
import com.tdp.ms.commonsvisor.exception.RestException;
import com.tdp.ms.commonsvisor.rest.ConfigRest;
import com.tdp.ms.commonsvisor.rest.RestOP;
import com.tdp.ms.commonsvisor.rest.header.HeaderOP;
import com.tdp.ms.productorder.ms.model.ProductRiOrderResponse;
import com.tdp.ms.productorder.util.ProductOrderConstantes;

import lombok.extern.slf4j.Slf4j;

/**
 * MsCustomerRi.
 * @author Ronald Barón
 * @version 1.0
 */
@Slf4j
@Service
public class MsProductOrderRi {
    
    /*@Autowired
    private MicroserviceProperty microserviceProperty;*/
    
    @Value("${microservices.retrieveProductOrderRi.url}")
    private String retrieveProductOrderUrl;
    @Value("${microservices.retrieveProductOrderRi.name}")
    private String retrieveProductOrderName;
    @Value("${microservices.retrieveProductOrderRi.metodos.listar.url}")
    private String retrieveProductOrderListar;
    
    /**
     * Metodo que llama la operacion listar de retrieve product order.
     * @author Jorge Ponce
     * @version 1.0
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<ProductRiOrderResponse> callListarProductOrder(MultiValueMap<String, String> headerMap,
            String productType, String publicId){
        
        
        String wsUrl = retrieveProductOrderUrl;
        String wsName = retrieveProductOrderName;
     
        
        String parametro = ProductOrderConstantes.CADENA_VACIA;
        
        if (Utilitarios.validarStringNotEmpty(productType)) {
            parametro += obtenerConectorParametro(parametro) + "productType=" + productType;
        }
        if (Utilitarios.validarStringNotEmpty(publicId)) {
            parametro += obtenerConectorParametro(parametro) + "publicId=" + publicId;
        }
        
        String metodo = retrieveProductOrderListar+parametro;
        
        String urlFull = wsUrl+metodo;
        //log.info("Url Full >>>> "+urlFull);
        
       
        try {
            log.info("MsProductOrderRi.callListarProductOrder.wsName >>>> "+wsName);
            log.info("MsProductOrderRi.callListarProductOrder.wsUrl  >>>> "+wsUrl);
            log.info("Url Full >>>> "+urlFull);
            //Utilitarios.showHeaders(headerMap);
            
        RestOP restOP = new RestOP(wsUrl);
        
        ConfigRest config = new ConfigRest(metodo);
        Class<List<ProductRiOrderResponse>> clazz = (Class) List.class;
        List<ProductRiOrderResponse> listaResponse = restOP.get(clazz,config);  
        
        String response  = Utilitarios.obtenerJson(listaResponse);
        
        log.info("MsProductOrderRi.callListarCliente.response: " + response);
        
        return Mapper.mapper(ProductRiOrderResponse.class, listaResponse);
        //return listaResponse;
        
        }catch (RestException e) {
            log.info("MsProductOrderRi.callListarCliente.RestException.getEstado: " + e.getEstado());
            log.info("MsProductOrderRi.callListarCliente.RestException.getMensaje: " + e.getMensaje());
            throw e;
        }
    }

    /**
     * Metodo que obtiene el conector de los parametros.
     * @author Ronald Barón
     * @version 1.0
     */
    private String obtenerConectorParametro(String parametro) {
        if (ProductOrderConstantes.CADENA_VACIA.equals(parametro)) {
            return ProductOrderConstantes.CONECTOR_INICIAL;
        } else {
            return ProductOrderConstantes.CONECTOR_PARAMETRO;
        }
    }
}
