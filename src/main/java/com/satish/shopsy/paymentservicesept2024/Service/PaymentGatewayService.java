package com.satish.shopsy.paymentservicesept2024.Service;

import com.satish.shopsy.paymentservicesept2024.model.PaymentResponse;

public interface PaymentGatewayService {

    PaymentResponse initiatePayment(String CustomerId,String paymentAmount,String orderId);

}
