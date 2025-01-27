package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.domain.models.Home;
import com.presupuesto.casa.infrastructure.entity.CategoryEntity;
import com.presupuesto.casa.infrastructure.entity.HomeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MapperCategory {
    List<Category> categoryListToCategory(List<CategoryEntity> categoryEntityList);
    Category categoryEntityToCategory(CategoryEntity categoryEntity);
    CategoryEntity categoryToCategoryEntity(Category category);
}
