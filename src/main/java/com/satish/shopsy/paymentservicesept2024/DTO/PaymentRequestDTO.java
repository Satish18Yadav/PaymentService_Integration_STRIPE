package com.satish.shopsy.paymentservicesept2024.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDTO {

    private String CustomerId;
    private String paymentAmount;
    private String OrderId;
}
