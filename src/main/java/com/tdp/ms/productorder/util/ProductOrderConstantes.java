package com.tdp.ms.productorder.util;

/**
 * Clase ProductOrderConstantes.
 * @author Jorge Ponce
 * @version 1.0
 */
public class ProductOrderConstantes {
    
 // General
    public static final String CADENA_VACIA = "";
    public static final String CONECTOR_INICIAL = "?";
    public static final String CONECTOR_PARAMETRO = "&";
   
    // Application
    public static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";
    
    // Mensajes de BD
    public static final String MENSAJE_ERROR_BD = "Error de conexión con BD.";
    
 // Header
    public static final String HDR_SERVICE_ID = "UNICA-ServiceId";
    public static final String HDR_APPLICATION = "UNICA-Application";
    public static final String HDR_PID = "UNICA-PID";
    public static final String HDR_USER = "UNICA-User";
    public static final String HDR_MIGRATION_INDICATOR = "migrationIndicator";
    public static final String HDR_ORIGIN_SYSTEM = "originSystem";
    
    // Mensajes de Validacion
    public static final String MENSAJE_FILTRO_BUSQUEDA_INVALIDO = "Debe enviar al menos un filtro de búsqueda valido.";
    public static final String MENSAJE_NO_EXISTE_INFORMACION = "No existe información.";
    public static final String MENSAJE_HEADER_INVALIDO =
            "Debe enviar headers validos: migrationIndicator, originSystem.";
    private ProductOrderConstantes() {
        
    }
    
}
