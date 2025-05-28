package com.presupuesto.casa.application.usecases.ports.input.category;

import com.presupuesto.casa.infrastructure.request.CategoryRequest;
import com.presupuesto.casa.infrastructure.response.CategoryResponse;

@FunctionalInterface
public interface SaveCategoryService {
    CategoryResponse saveCategory(CategoryRequest categoryRequest);
}
