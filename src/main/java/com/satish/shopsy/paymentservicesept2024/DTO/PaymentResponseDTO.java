package com.satish.shopsy.paymentservicesept2024.DTO;

import com.satish.shopsy.paymentservicesept2024.model.PaymentResponse;
import lombok.Setter;

@Setter
public class PaymentResponseDTO {

    private String customerId;
    private String paymentAmount;
    private String orderId;

    public String redirectURL;


    public PaymentResponseDTO convertToPaymentResponseDTO(PaymentResponse paymentResponse){
        PaymentResponseDTO paymentResponseDTO = new PaymentResponseDTO();
        paymentResponseDTO.setCustomerId(paymentResponse.getCustomerId());
        paymentResponseDTO.setPaymentAmount(paymentResponse.getPaymentAmount());
        paymentResponseDTO.setOrderId(paymentResponse.getOrderId());

        return paymentResponseDTO;
    }
}
