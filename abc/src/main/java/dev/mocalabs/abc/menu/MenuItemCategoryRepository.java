package dev.mocalabs.abc.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemCategoryRepository extends JpaRepository<MenuItemCategory, Long> {}