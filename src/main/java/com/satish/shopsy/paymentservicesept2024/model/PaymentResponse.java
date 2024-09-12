package com.satish.shopsy.paymentservicesept2024.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentResponse {
    private String customerId;
    private String paymentAmount;
    private String orderId;
    String redirectURL;

}
