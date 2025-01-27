package com.presupuesto.casa.application.usecases.ports.input.category;

import com.presupuesto.casa.domain.models.Category;

@FunctionalInterface
public interface SaveCategoryService {
    Category saveCategory(Category category);
}
