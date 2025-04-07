package com.example.order.orderLine;

public record OrderLineRequest(Integer id,
                               Integer orderId,
                               Integer productId,
                               double quantity) {
}
