package dev.mocalabs.abc.menu;

import java.util.List;

public interface MenuItemService {
    List<MenuItemResponse> getAllMenuItems();
    List<MenuItemResponse> getMenuItemsByCategory(long categoryId);
}