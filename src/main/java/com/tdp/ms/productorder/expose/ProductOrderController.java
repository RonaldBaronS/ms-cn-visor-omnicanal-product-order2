package com.tdp.ms.productorder.expose;

import com.tdp.ms.commonsvisor.Utilitarios;
import com.tdp.ms.commonsvisor.controller.BaseController;
import com.tdp.ms.commonsvisor.exception.GeneralTdpException;
import com.tdp.ms.productorder.business.interactors.ListarClienteProductOrder;
import com.tdp.ms.productorder.model.ProductOrderListParam;
import com.tdp.ms.productorder.model.ProductOrderResponse;
import com.tdp.ms.productorder.util.ProductOrderConstantes;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductOrderControllerr.
 * @author Ronald Barón.
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/productorder/v1")
public class ProductOrderController extends BaseController {
    
    /*@Autowired
    private MicroserviceProperty microserviceProperty;*/
    
    
    @Autowired
    private ListarClienteProductOrder listarCliente;
    
    @GetMapping("/message")
    public String message() {
        return "Welcome Product Order";
    }
    
    @GetMapping(value = "/productOrders" , produces = ProductOrderConstantes.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ProductOrderResponse>> listarProductOrder(
            @RequestHeader MultiValueMap<String, String> headerMap,
            ProductOrderListParam request
            ) {
        log.info("ProductOrderController.listarProductOrder.request >>>>>>>" +Utilitarios.obtenerJson(request));
        
        if (!Utilitarios.validarStringNotEmpty(
                Utilitarios.obtenerHeaderValue(headerMap, ProductOrderConstantes.HDR_MIGRATION_INDICATOR),
                Utilitarios.obtenerHeaderValue(headerMap, ProductOrderConstantes.HDR_ORIGIN_SYSTEM))) {
            throw new GeneralTdpException(ProductOrderConstantes.MENSAJE_HEADER_INVALIDO);
        }
       
        String productType = request.getProductType();
        String publicId = request.getPublicId();
        
        
        
        if (Utilitarios.validarStringEmpty(productType, publicId)) {
            throw new GeneralTdpException(ProductOrderConstantes.MENSAJE_FILTRO_BUSQUEDA_INVALIDO);
        } else {
            listarCliente.setHeaderMap(headerMap);
            listarCliente.setProductType(productType);
            listarCliente.setPublicId(publicId);
            
            log.info("ProductOrderController.listarCliente.response >>>>>>> " + Utilitarios.obtenerJson(listarCliente));
            
            return negociate(ProductOrderResponse.class, listarCliente.ejecutar());
            //return null;
        }
    }
}
        
        
    