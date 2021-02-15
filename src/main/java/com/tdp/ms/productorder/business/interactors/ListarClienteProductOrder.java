package com.tdp.ms.productorder.business.interactors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.tdp.ms.commonsvisor.exception.RestException;
import com.tdp.ms.commonsvisor.interactors.UseCase;
import com.tdp.ms.productorder.business.dto.ProductOrderDto;
//import com.tdp.ms.productorder.config.MicroserviceProperty;
import com.tdp.ms.productorder.ms.MsProductOrderRi;
import com.tdp.ms.productorder.ms.model.ProductRiOrderResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * ListarCliente.
 * @author Ronald Barón.
 * @version 1.0.
 */
@Slf4j
@Service
public class ListarClienteProductOrder extends UseCase<List<ProductOrderDto>> {
    
    @Autowired
    private MsProductOrderRi msProductOrderRi;
    
    //@Autowired
    //private MicroserviceProperty microserviceProperty;
    
    private MultiValueMap<String, String> headerMap;
    private String productType;
    private String publicId;
    
    @Override
    protected List<ProductOrderDto> construirCaso() {
        log.info("ListarCliente.construirCaso");
        
        List<ProductRiOrderResponse> listaRiRetrieveProductOrder = listarClienteRi(headerMap, productType, publicId);
        
        return ProductRiOrderResponse.mapper(listaRiRetrieveProductOrder);
    }
    
    
    private List<ProductRiOrderResponse> listarClienteRi(MultiValueMap<String, String> headerMap,
           String productType, String publicId) {
        
        List<ProductRiOrderResponse> listaRiRetrieveProductOrder = null;
        
        try {
            listaRiRetrieveProductOrder = msProductOrderRi.callListarProductOrder(headerMap, productType, publicId);
            log.info("ListarClienteProductOrder.listarClienteRi >>>>>> "+listaRiRetrieveProductOrder.toString());
            
            
        }catch (RestException e) {
            int status = e.getEstado();
            log.info(" RestException >>>>> ");
        }
        
         return listaRiRetrieveProductOrder;
    }
    
    
    
    
    
    
    public void setHeaderMap(MultiValueMap<String, String> headerMap) {
        this.headerMap = headerMap;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }



}
