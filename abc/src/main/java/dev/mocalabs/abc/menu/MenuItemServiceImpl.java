package dev.mocalabs.abc.menu;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {
    @Autowired
    private final MenuItemRepository menuItemRepository;

    @Autowired
    private final MenuItemMapper menuItemMapper;

    @Autowired
    private final MenuItemCategoryRepository menuItemCategoryRepository;

    @Transactional(readOnly=true)
    @Override
    public List<MenuItemResponse> getAllMenuItems() {
        List<MenuItem> menuItems = menuItemRepository.findAllWithCategory();
        return menuItems.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());

    }

    @Transactional(readOnly=true)
    @Override
    public List<MenuItemResponse> getMenuItemsByCategory(long categoryId) {
        List<MenuItem> menuItems = menuItemRepository.findByCategory(categoryId);
        return menuItems.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    // Helper method to map Entity to Response
    private MenuItemResponse mapToResponse(MenuItem menuItem) {
        String categoryName = "";
        if (menuItem.getCategory() != null) {
            categoryName = menuItem.getCategory().getDescription();
        }
        return new MenuItemResponse(
                menuItem.getId(),
                menuItem.getMenuItemName(),
                menuItem.getMenuItemDescription(),
                menuItem.getMenuItemPrice(),
                categoryName
        );
    }
}