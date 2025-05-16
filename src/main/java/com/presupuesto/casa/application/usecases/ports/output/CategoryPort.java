package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Category;
import java.util.List;

public interface CategoryPort {
    List<Category> getCategories();
    Category saveCategory(Category category);
    void deleteCategory(Long categoryId);
}
