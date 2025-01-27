package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.infrastructure.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    List<Category> getAll();
}
