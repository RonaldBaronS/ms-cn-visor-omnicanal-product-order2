package com.tdp.ms.productorder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tdp.ms.commonsvisor.model.ResponseBase;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase ProductOrderResponse.
 * @author Ronald Barón.
 * @version 1.0
 */
@Getter
@Setter
@NoArgsConstructor
public class ProductOrderResponse extends ResponseBase {
    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("correlationId")
    private String correlationId;
    /*private String description;
    private String type;
    private List<ProductOrderClass> productOrderClass;
    private String accountId;
    private Integer priority;
    private Integer requestedPriority;
    private List<RelatedParty> relatedParty;
    private List<RelatedObject> relatedObject;
    private Channel channel;
    private String requestedStartDate;
    private String requestedCompletionDate;
    private String orderDate;
    private String expectedCompletionDate;
    private String completionDate;
    private List<Note> note;
    private String status;
    private String subStatus;
    private String statusReason;
    private String statusChangeDate;
    private String source;
    private List<OrderItem> orderItem;
    private List<DeploymentWorks> deploymentWorks;
    private List<AdditionalData> additionalData;*/
    
    /**
     * ProductOrderClass.
     * @author Ronald Barón.
     * @version 1.0
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProductOrderClass {
        private String id;
        private String href;
        private String name;
    }
    
    /**
     * RelatedParty.
     * @author Ronald Barón.
     * @version 1.0
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class RelatedParty {
       private String id;
       private String href;
       private String name;
       private String role;
       private ValidFor validFor;
       @JsonProperty("@referredType")
       private String referredType;
       private String description;
       private List<LegalId> legalId;
       
       @Getter
       @Setter
       @NoArgsConstructor
       public static class ValidFor {
           private String startDateTime;
           private String endDateTime;
       }
       
       @Getter
       @Setter
       @NoArgsConstructor
       public static class LegalId {
           private String country;
           private String isPrimary;
           private String nationalIdType;
           private String nationalId;
       }
    }
    
    /**
     * RelatedObject.
     * @author Ronald Barón.
     * @version 1.0
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class RelatedObject {
        private String involvement;
        private String reference;
        private String href;
        private ValidFor validFor;
        private AdditionalData additionalData;
        
        /**
         * ValidFor.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
        public static class ValidFor {
            private String startDateTime;
            private String endDateTime;
        }
        /**
         * AdditionalData.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
        public static class AdditionalData {
            private String key;
            private String value;
        }
        
        
    }
    
    /**
     * Channel.
     * @author Ronald Barón.
     * @version 1.0
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class Channel {
        private String id;
        private String href;
        private String name;
        private String description;
        private String role;
    }
    
    /**
     * Note.
     * @author Ronald Barón.
     * @version 1.0
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class Note {
        private String date;
        private String author;
        private String text;
        private AdditionalData additionalData;
        
        /**
         * AdditionalData.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
        public static class AdditionalData {
            private String key;
            private String value;
        }
    }
    
    /**
     * AdditionalData.
     * @author Ronald Barón.
     * @version 1.0
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class AdditionalData {
        private String key;
        private String value;
    }
    
    /**
    * OrderItem.
    * @author Ronald Barón.
    * @version 1.0
    */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class OrderItem {
        private String id;
        private String description;
        private String action;
        private String parent;
        private ProductOffering productOffering;
        private Product product;
        private String quantity;
        private String minQuantity;
        private String maxQuantity;
        private List<OrderItemPrice> orderItemPrice;
        private List<BillingAccount> billingAccount;
        private PaymentMethod paymentMethod;
        private String status;
        private String statusReason;
        private String activationStatus;
        private ValidFor validFor;
        private boolean isAutoRenew;
        private String recurringPeriod;
        private Integer nrOfPeriods;
        private List<RelatedObject> relatedObject;
        private List<AdditionalData> additionalData;
        
        /**
        * ValidFor.
        * @author Ronald Barón.
        * @version 1.0
        */
       @Getter
       @Setter
       @NoArgsConstructor
        public static class ValidFor {
            private String startDateTime;
            private String endDateTime;
        }
        /**
         * PaymentMethod.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
         public static class PaymentMethod {
             private String id;
             private String href;
             private String name;
             private String description;
             @JsonProperty("@referredType")
             private String referredType;
             
         }
        
        /**
         * ProductOffering.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
         public static class ProductOffering {
             private String id;
             private String href;
             private String name;
             private String description;
             @JsonProperty("@referredType")
             private String referredType;
             
         }
        /**
         * Product.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
         public static class Product {
             private String id;
             private String href;
             private String name;
             private String publicId;
             private String description;
             private String productType;
             private List<Category> category;
             private String startDate;
             private String terminationDate;
             private List<Place> place;
             private ProductSpec productSpec;
             private List<Characteristic> characteristic;
             private List<RelatedParty> relatedParty;
             private List<ProductRelationship> productRelationship;
             private List<AdditionalData> additionalData;
             
             /**
              * Category.
              * @author Ronald Barón.
              * @version 1.0
              */
             @Getter
             @Setter
             @NoArgsConstructor
              public static class Category {
                  private String id;
                  private String href;
                  private String name;
                  
              }
             /**
              * Place.
              * @author Ronald Barón.
              * @version 1.0
              */
             @Getter
             @Setter
             @NoArgsConstructor
              public static class Place {
                 private String id;
                 private String href;
                 private String name;
                 @JsonProperty("@referredType")
                 private String referredType;
               }
             /**
              * Place.
              * @author Ronald Barón.
              * @version 1.0
              */
             @Getter
             @Setter
             @NoArgsConstructor
              public static class ProductSpec {
                 private String id;
                 private String href;
                 private String name;
                 @JsonProperty("@referredType")
                 private String referredType;
              }
             /**
              * Characteristic.
              * @author Ronald Barón.
              * @version 1.0
              */
             @Getter
             @Setter
             @NoArgsConstructor
              public static class Characteristic {
                 private String valueType;
                 @JsonProperty("@type")
                 private String type;
              }
             
             /**
              * ProductRelationship.
              * @author Ronald Barón.
              * @version 1.0
              */
             @Getter
             @Setter
             @NoArgsConstructor
             public static class ProductRelationship {
                 private String type;
             }
             
         }
        /**
         * OrderItemPrice.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
         public static class OrderItemPrice {
             private String id;
             private String name;
             private String description;
             private String isMandatory;
             private String priceType;
             private String recurringChargePeriod;
             private UnitOfMeasure unitOfMeasure;
             private Price price;
             private boolean taxIncluded;
             private float taxRate;
             private String taxType;
             private List<ProdPriceAlteration> prodPriceAlteration;
             private List<AdditionalData> additionalData;
             
             /**
             * UnitOfMeasure.
             * @author Ronald Barón.
             * @version 1.0
             */
            @Getter
            @Setter
            @NoArgsConstructor
            public static class UnitOfMeasure {
                 private float amount;
                 private float maximum;
                 private float minimun;
                 private String units;
             }
            /**
             * Price.
             * @author Ronald Barón.
             * @version 1.0
             */
            @Getter
            @Setter
            @NoArgsConstructor
            public static class Price {
                private float amount;
                private String units;
            }
            
            /**
             * ProdPriceAlteration.
             * @author Ronald Barón.
             * @version 1.0
             */
            @Getter
            @Setter
            @NoArgsConstructor
            public static class ProdPriceAlteration {
                private String name;
                private String description;
                private ValidFor validFor;
                private String priceCondition;
                private String priority;
                private String priceType;
                private String recurringChargePeriod;
                private Integer applicationDuration;
                private String discountType;
                private UnitOfMeasure unitOfMeasure;
                private Price price;
                private AdditionalData additionalData;
                
                /**
                 * ValidFor.
                 * @author Ronald Barón.
                 * @version 1.0
                 */
                @Getter
                @Setter
                @NoArgsConstructor
                public static class ValidFor {
                    private String startDateTime;
                    private String endDateTime;
                }
            }
         }
         
        /**
         * BillingAccount.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
         public static class BillingAccount {
             private String id;
             private String href;
             private String name;
             @JsonProperty("@referredType")
             private String referredType;
             private String billingMethod;
         }
    
    }
    
    /**
     * DeploymentWorks.
     * @author Ronald Barón.
     * @version 1.0
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class DeploymentWorks {
        private String name;
        private List<String> orderItems;
        private List<Costs> costs;
        private List<Characteristics> characteristics;
        
        /**
         * Characteristics.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
        public static class Characteristics {
            private String key;
            private String value;
        }
        
        /**
         * Costs.
         * @author Ronald Barón.
         * @version 1.0
         */
        @Getter
        @Setter
        @NoArgsConstructor
        public static class Costs {
            private String name;
            private List<Price>  price;
            private String type;
            private String subject;
            
            /**
             * Price.
             * @author Ronald Barón.
             * @version 1.0
             */
            @Getter
            @Setter
            @NoArgsConstructor
            public static class Price {
                private float amount;
                private String units;
                
            }
        }
       
    }
    
    @Override
    public void map(Object objeto) {
        // Override
    }
    
}
