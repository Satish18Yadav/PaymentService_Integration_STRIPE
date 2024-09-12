package com.satish.shopsy.paymentservicesept2024.Controller.webhook;


import com.satish.shopsy.paymentservicesept2024.DTO.webhook.RazorpayProcessRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RazorpayWebhook {

    @PostMapping("/webhook/razorpay")
    public void orderStatus(@RequestBody RazorpayProcessRequestDTO dto) {
        //write the implementations on the basis of the eventId
    }
}
