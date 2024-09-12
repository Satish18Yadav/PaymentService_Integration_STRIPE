package com.satish.shopsy.paymentservicesept2024.Service.webhook;

import com.satish.shopsy.paymentservicesept2024.DTO.webhook.StripeProcessRequestDTO;

public interface iStripeWebhookService {

    void ProcessEvent(StripeProcessRequestDTO dto);
}
