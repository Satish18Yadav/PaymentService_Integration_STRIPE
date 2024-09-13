package com.satish.shopsy.paymentservicesept2024.Controller;

import com.razorpay.RazorpayException;
import com.satish.shopsy.paymentservicesept2024.DTO.PaymentRequestDTO;
import com.satish.shopsy.paymentservicesept2024.DTO.PaymentResponseDTO;
import com.satish.shopsy.paymentservicesept2024.Service.PaymentGatewayService;
import com.satish.shopsy.paymentservicesept2024.model.PaymentResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class paymentController {

    private PaymentGatewayService stripeService;
    private PaymentGatewayService razorpayService;
    private PaymentResponseDTO paymentResponseDTO;
    public paymentController(@Qualifier("StripePaymentService") PaymentGatewayService
                                     stripeService,
                             @Qualifier("RazorPayService") PaymentGatewayService razorpayService) {
        this.stripeService = stripeService;
        this.razorpayService = razorpayService;
    }
    @PostMapping("/payment/customer")
    public PaymentResponseDTO makePayment(@RequestBody PaymentRequestDTO paymentDto) throws JSONException, RazorpayException {

        if(isValid(paymentDto)){
            try{
                if(paymentDto.getCustomerId()==null){
                    System.out.println("Ready to execute the payment process");
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        //this is service hence we will return model from here
       PaymentGatewayService paymentGatewayType = getPaymentgateway();
        PaymentResponse paymentResponse = paymentGatewayType.initiatePayment(paymentDto.getCustomerId(),
                paymentDto.getPaymentAmount(),paymentDto.getOrderId());



        return paymentResponseDTO.convertToPaymentResponseDTO(paymentResponse);
    }


    private PaymentGatewayService getPaymentgateway() {
        Random random = new Random();
      int num= random.nextInt(2);
      if(num==1) return razorpayService;
      else return stripeService;
    }

    private boolean isValid(PaymentRequestDTO paymentDto) {
        return paymentDto.getCustomerId()!=null &&
                paymentDto.getPaymentAmount()!=null &&
                paymentDto.getOrderId()!=null;
    }
}
