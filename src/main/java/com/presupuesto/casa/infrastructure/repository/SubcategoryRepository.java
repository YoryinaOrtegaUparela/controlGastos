package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.infrastructure.entity.CategoryEntity;
import com.presupuesto.casa.infrastructure.entity.SubCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoryRepository extends JpaRepository<SubCategoryEntity, Long> {
}
