package dev.mocalabs.abc.menu;

import java.math.BigDecimal;

public record MenuItemResponse(
        Long id,
        String name,
        String description,
        BigDecimal price,
        String categoryName
) {}