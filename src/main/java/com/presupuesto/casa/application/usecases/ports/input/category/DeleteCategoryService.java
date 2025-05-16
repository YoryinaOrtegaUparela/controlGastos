package com.presupuesto.casa.application.usecases.ports.input.category;

@FunctionalInterface
public interface DeleteCategoryService {
    void deleteCategory(Long categoryId);
}
