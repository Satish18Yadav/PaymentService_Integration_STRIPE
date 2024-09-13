package com.satish.shopsy.paymentservicesept2024.Service;

import com.razorpay.RazorpayException;
import com.satish.shopsy.paymentservicesept2024.model.PaymentResponse;
import org.springframework.boot.configurationprocessor.json.JSONException;

public interface PaymentGatewayService {

    PaymentResponse initiatePayment(String CustomerId,String paymentAmount,String orderId) throws RazorpayException, JSONException;

}
