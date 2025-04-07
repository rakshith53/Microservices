package com.example.payment.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentMapper {

    public Payment toPayment(PaymentRequest paymentRequest){
        return Payment.builder()
                .id(paymentRequest.id())
                .orderId(paymentRequest.orderID())
                .paymentMethod(paymentRequest.paymeentMethod())
                .amount(paymentRequest.amount())
                .build();
    }
}
