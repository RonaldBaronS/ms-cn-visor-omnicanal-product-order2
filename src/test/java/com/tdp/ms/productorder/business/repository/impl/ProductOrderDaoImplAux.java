package com.tdp.ms.productorder.business.repository.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdp.ms.productorder.business.dto.ProductOrderDto;
//import com.tdp.ms.productorder.business.repository.ProductOrderDao;

import java.io.File;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductOrderDaoImplAux  {
    
    /*@Override
    public ProductOrderDto buscarArea(String areaId) {
        log.info("ProductOrderDaoImplAux.buscarArea.areaId: " + areaId);
        try {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<ProductOrderDto>> type = new TypeReference<List<ProductOrderDto>>() {
            };
            ClassLoader classLoader = getClass().getClassLoader();
            List<ProductOrderDto> list = mapper
                    .readValue(new File(classLoader.getResource("data-product-order-test.json").getFile()), type);
            ProductOrderDto productOrderDto = list.stream().filter(item -> areaId.equals(item.getAreaId())).findAny().orElse(null);
            return productOrderDto;
            
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }*/
    
}
