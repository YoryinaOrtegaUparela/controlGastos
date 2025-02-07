package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.domain.models.SubCategory;

public interface SubcategoryPort {

    SubCategory saveCategory(SubCategory category);
}
