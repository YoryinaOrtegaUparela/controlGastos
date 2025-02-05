package com.presupuesto.casa.application.usecases.ports.input.category;

import com.presupuesto.casa.domain.models.Category;

import java.util.List;

@FunctionalInterface
public interface GetCategoryService {
    List<Category> getCategories();
}
