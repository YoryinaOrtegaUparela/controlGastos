package com.presupuesto.casa.application.usecases.interactors.subcategory;

import com.presupuesto.casa.application.usecases.ports.input.category.SaveCategoryService;
import com.presupuesto.casa.application.usecases.ports.input.subcategory.SaveSubCategoryService;
import com.presupuesto.casa.application.usecases.ports.output.CategoryPort;
import com.presupuesto.casa.application.usecases.ports.output.SubcategoryPort;
import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.domain.models.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveSubCategoryServiceImpl implements SaveSubCategoryService {

    @Autowired
    private SubcategoryPort subcategoryPort;


    @Override
    public SubCategory saveSubCategory(SubCategory category) {
        return subcategoryPort.saveCategory(category);
    }
}
