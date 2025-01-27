package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.domain.models.Home;
import com.presupuesto.casa.domain.models.SubCategory;
import com.presupuesto.casa.infrastructure.entity.CategoryEntity;
import com.presupuesto.casa.infrastructure.entity.HomeEntity;
import com.presupuesto.casa.infrastructure.entity.SubCategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper
public interface MapperCategory {

    List<Category> categoryListToCategory(List<CategoryEntity> categoryEntityList);
    @Mapping(source = "subCategories", target = "subCategories")
    Category categoryEntityToCategory(CategoryEntity categoryEntity);
    @Mapping(source = "subCategories", target = "subCategories")
    CategoryEntity categoryToCategoryEntity(Category category);
    SubCategory subCategoryEntityToSubCategory(SubCategoryEntity subCategoryEntity);
    SubCategoryEntity subCategoryToSubCategoryEntity(SubCategory subCategory);
}
