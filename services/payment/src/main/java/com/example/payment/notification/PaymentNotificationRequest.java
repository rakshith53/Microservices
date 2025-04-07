package com.example.payment.notification;

import com.example.payment.payment.PaymentMethod;
import org.apache.kafka.common.protocol.types.Field;

import java.math.BigDecimal;

public record PaymentNotificationRequest(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstName,
        String customerLastName,
        String customerEmail
) {
}
