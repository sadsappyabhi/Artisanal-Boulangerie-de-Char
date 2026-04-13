package dev.mocalabs.abc.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    @Query("SELECT m FROM MenuItem m LEFT JOIN FETCH m.category")
    List<MenuItem> findAllWithCategory();

    @Query("SELECT m FROM MenuItem m LEFT JOIN FETCH m.category WHERE m.id = :id")
    Optional<MenuItem> findById(@Param("id") long id);

    @Query("SELECT m FROM MenuItem m LEFT JOIN FETCH m.category WHERE m.category.id = :categoryId")
    List<MenuItem> findByCategory(@Param("categoryId") long categoryId);
}