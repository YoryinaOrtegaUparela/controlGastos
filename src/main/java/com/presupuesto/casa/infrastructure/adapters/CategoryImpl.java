package com.presupuesto.casa.infrastructure.adapters;

import com.presupuesto.casa.application.usecases.ports.output.CategoryPort;
import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.infrastructure.entity.CategoryEntity;
import com.presupuesto.casa.infrastructure.mappers.MapperCategory;
import com.presupuesto.casa.infrastructure.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements CategoryPort {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private MapperCategory mapperCategory;


    @Override
    public List<Category> getCategories() {
      //  return mapperCategory.categoryListToCategory(categoryRepository.findAll());
return null;
    }

    @Override
    public Category saveCategory(Category category) {

        CategoryEntity categoryEntity = mapperCategory.categoryToCategoryEntity(category);

        CategoryEntity categoryCreatedEntity = categoryRepository.save(categoryEntity);


        Category categoryCreated = mapperCategory.categoryEntityToCategory(categoryCreatedEntity);
        return categoryCreated;

    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
