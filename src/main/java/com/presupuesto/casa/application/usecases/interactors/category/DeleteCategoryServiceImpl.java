package com.presupuesto.casa.application.usecases.interactors.category;

import com.presupuesto.casa.application.usecases.ports.input.category.DeleteCategoryService;
import com.presupuesto.casa.application.usecases.ports.output.CategoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteCategoryServiceImpl implements DeleteCategoryService {

    @Autowired
    private CategoryPort categoryPort;

    @Override
    public void deleteCategory(Long categoryId) {
        categoryPort.deleteCategory(categoryId);
    }
}
