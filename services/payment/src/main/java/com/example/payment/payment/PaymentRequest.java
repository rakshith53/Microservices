package com.example.payment.payment;

import java.math.BigDecimal;

public record PaymentRequest(
    Integer id,
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderID,
    String orderReference,
    Customer customer
    )
{
}
