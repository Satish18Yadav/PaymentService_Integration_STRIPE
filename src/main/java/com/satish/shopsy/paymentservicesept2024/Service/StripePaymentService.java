package com.satish.shopsy.paymentservicesept2024.Service;

import com.satish.shopsy.paymentservicesept2024.model.PaymentResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("StripePaymentService")

public class StripePaymentService implements PaymentGatewayService {


    @Override
    public PaymentResponse initiatePayment(String CustomerId,
                                           String paymentAmount,
                                           String orderId) {



        // fromm here we will call the stripe
        return null;
    }
}
