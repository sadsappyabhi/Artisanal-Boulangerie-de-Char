package dev.mocalabs.abc.menu;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface MenuItemMapper {
    @Mapping(source="menuItemName", target="name")
    @Mapping(source="menuItemDescription", target="description")
    @Mapping(source="menuItemPrice", target="price")
    @Mapping(source="category.id", target="category")
    @Mapping(source="category.description", target="categoryName")
    @Mapping(source="createdAt", target="createdAt")
    MenuItemRequest menuItemToMenuItemRequest(MenuItem menuItem);
}