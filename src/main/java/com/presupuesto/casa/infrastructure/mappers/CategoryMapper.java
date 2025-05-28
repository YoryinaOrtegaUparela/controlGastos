package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.infrastructure.entity.CategoryEntity;
import com.presupuesto.casa.infrastructure.request.CategoryRequest;
import com.presupuesto.casa.infrastructure.response.CategoryResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category requestToCategory(CategoryRequest categoryRequest);
    CategoryResponse categoryToResponse(Category category);

    CategoryEntity toEntity(Category category);
    Category entityToCategory(CategoryEntity categoryEntity);

    List<CategoryResponse> categoriesToResponses(List<Category> categories);
    List<Category> entitiesToCategories(List<CategoryEntity> categoryEntities);
}
