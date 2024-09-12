package com.satish.shopsy.paymentservicesept2024.Service.webhook;

import com.satish.shopsy.paymentservicesept2024.DTO.webhook.RazorpayProcessRequestDTO;

public interface iRazorpayWebhookService {
    void ProcessEvent(RazorpayProcessRequestDTO dto);
}
