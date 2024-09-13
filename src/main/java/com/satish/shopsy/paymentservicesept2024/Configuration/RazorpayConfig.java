package com.satish.shopsy.paymentservicesept2024.Configuration;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {

    @Value("${RazorpayClient.key_Id}")
    String razorpayId;
    @Value("${RazorpayClient.Secret_key}")
    String razorpaySecretKey;

    @Bean
    public RazorpayClient createRazorPayClient() throws RazorpayException {
        return new RazorpayClient(razorpayId, razorpaySecretKey);
    }
}
