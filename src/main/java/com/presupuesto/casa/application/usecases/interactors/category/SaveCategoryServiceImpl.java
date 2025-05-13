package com.presupuesto.casa.application.usecases.interactors.category;

import com.presupuesto.casa.application.usecases.ports.input.category.SaveCategoryService;
import com.presupuesto.casa.application.usecases.ports.output.CategoryPort;
import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.infrastructure.mappers.CategoryMapper;
import com.presupuesto.casa.infrastructure.request.CategoryRequest;
import com.presupuesto.casa.infrastructure.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveCategoryServiceImpl implements SaveCategoryService {

    @Autowired
    private CategoryPort categoryPort;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public CategoryResponse saveCategory(CategoryRequest categoryRequest) {
        Category category = categoryMapper.requestToCategory(categoryRequest);
        Category categorySaved = categoryPort.saveCategory(category);
        return categoryMapper.categoryToResponse(categorySaved);
    }
}
