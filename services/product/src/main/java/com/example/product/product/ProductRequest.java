package com.example.product.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest(
        Integer id,
        @NotNull(message = "Product name is required")
        String name,
        @NotNull(message = "Product description is required")
        String description,
        @Positive(message = "AvailableQuantity should be positive required")
        double availableQuantity,
        @Positive(message = "Price should be positive required")
        BigDecimal price,
        @NotNull(message = "CategoryId is required")
        Integer categoryId
) {
}
