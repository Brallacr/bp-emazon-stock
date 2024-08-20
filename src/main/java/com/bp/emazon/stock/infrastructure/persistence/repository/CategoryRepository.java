package com.bp.emazon.stock.infrastructure.persistence.repository;

import com.bp.emazon.stock.infrastructure.persistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    CategoryEntity findByName(String name);
}
