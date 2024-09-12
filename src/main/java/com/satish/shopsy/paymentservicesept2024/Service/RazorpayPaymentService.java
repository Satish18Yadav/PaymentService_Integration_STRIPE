package com.satish.shopsy.paymentservicesept2024.Service;

import com.satish.shopsy.paymentservicesept2024.model.PaymentResponse;
import org.springframework.stereotype.Service;

@Service("RazorPayService")
public class RazorpayPaymentService implements PaymentGatewayService{

    @Override
    public PaymentResponse initiatePayment(String CustomerId,
                                           String paymentAmount,
                                           String orderId) {
        // fromm here we will call the Razorpay
        return new PaymentResponse();
    }
}
