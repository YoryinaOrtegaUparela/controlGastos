package com.presupuesto.casa.application.usecases.interactors.category;

import com.presupuesto.casa.application.usecases.ports.input.category.GetCategoryService;
import com.presupuesto.casa.application.usecases.ports.output.CategoryPort;
import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.infrastructure.mappers.CategoryMapper;
import com.presupuesto.casa.infrastructure.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GetCategoryServiceImpl implements GetCategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryPort categoryPort;

    @Override
    public List<CategoryResponse> getCategories() {
        List<Category> categoryList = categoryPort.getCategories();
        return categoryMapper.categoriesToResponses(categoryList);
    }
}
