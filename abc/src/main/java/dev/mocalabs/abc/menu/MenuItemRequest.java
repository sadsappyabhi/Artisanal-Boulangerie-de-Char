package dev.mocalabs.abc.menu;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public record MenuItemRequest(
        Long id,
        @NotBlank(message="Name is required")String name,
        @NotBlank(message="Description is required")String description,
        @NotNull(message="Price is required")@Positive(message="Price must be positive") BigDecimal price,
        @NotNull(message="Category is required")@Positive(message="Category ID must be positive")Long category,
        String categoryName,
        LocalDateTime createdAt
) {}