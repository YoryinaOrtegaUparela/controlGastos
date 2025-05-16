package com.presupuesto.casa.application.usecases.ports.input.category;

import com.presupuesto.casa.infrastructure.response.CategoryResponse;

import java.util.List;

@FunctionalInterface
public interface GetCategoryService {
    List<CategoryResponse> getCategories();
}
