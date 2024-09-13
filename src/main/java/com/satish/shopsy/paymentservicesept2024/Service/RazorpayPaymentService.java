package com.satish.shopsy.paymentservicesept2024.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.satish.shopsy.paymentservicesept2024.model.PaymentResponse;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONException;

import org.springframework.stereotype.Service;

@Service("RazorPayService")
public class RazorpayPaymentService implements PaymentGatewayService{


    private final RazorpayClient razorpay;

    public RazorpayPaymentService(RazorpayClient razorpay) {
        this.razorpay = razorpay;
    }


    @Override
    public PaymentResponse initiatePayment(String customerId,
                                           String paymentAmount,
                                           String orderId) throws RazorpayException, JSONException {
        // fromm here we will call the Razorpay

      //  RazorpayClient razorpay = new RazorpayClient("[YOUR_KEY_ID]", "[YOUR_KEY_SECRET]");

        JSONObject orderRequest = createOrderRequestForRazorpay(customerId,paymentAmount,orderId);


        Order order = razorpay.orders.create(orderRequest);

        return new PaymentResponse(order);
    }

    @NotNull
    private  JSONObject createOrderRequestForRazorpay(String customerId,String paymentAmount, String orderId) {
        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", paymentAmount);  // Amount is in paise (₹500.00)
        orderRequest.put("currency", "INR");
        orderRequest.put("receipt", "some_number");

//        JSONObject notes = new JSONObject();
//        notes.put("notes_key_1", "Tea, Earl Grey, Hot");
       // orderRequest.put("notes", notes);
        return orderRequest;
    }
}
