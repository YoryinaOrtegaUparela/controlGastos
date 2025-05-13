package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Category;

public interface CategoryPort {
    Category saveCategory(Category category);
}
