package com.presupuesto.casa.application.usecases.ports.input.subcategory;

import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.domain.models.SubCategory;

@FunctionalInterface
public interface SaveSubCategoryService {
    SubCategory saveSubCategory(SubCategory category);
}
