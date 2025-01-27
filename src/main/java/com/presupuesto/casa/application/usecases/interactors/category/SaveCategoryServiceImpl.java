package com.presupuesto.casa.application.usecases.interactors.category;

import com.presupuesto.casa.application.usecases.ports.input.category.SaveCategoryService;
import com.presupuesto.casa.application.usecases.ports.output.CategoryPort;
import com.presupuesto.casa.domain.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveCategoryServiceImpl implements SaveCategoryService {

    @Autowired
    private CategoryPort categoryPort;

    @Override
    public Category saveCategory(Category category) {
        return categoryPort.saveCategory(category);
    }
}
