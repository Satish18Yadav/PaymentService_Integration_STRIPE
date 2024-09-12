package com.satish.shopsy.paymentservicesept2024.Controller.webhook;

import com.satish.shopsy.paymentservicesept2024.DTO.webhook.StripeProcessRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StripeWebhook {

    @PostMapping("/webhook/stripe")
    public void OrderStatus(@RequestBody StripeProcessRequestDTO dto) {
        //write the implementation on the basis of the eventId
        /*
        * if the event is success( then do something)
        * and return order.status as -> success
        *
        * if the process fails due to wrong credentials then we need to do something else
        *
        *
        *
        * */
    }
}
