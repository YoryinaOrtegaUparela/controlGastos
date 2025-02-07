package com.presupuesto.casa.infrastructure.adapters;

import com.presupuesto.casa.application.usecases.ports.output.SubcategoryPort;
import com.presupuesto.casa.domain.models.SubCategory;
import com.presupuesto.casa.infrastructure.entity.SubCategoryEntity;
import com.presupuesto.casa.infrastructure.mappers.MapperCategory;
import com.presupuesto.casa.infrastructure.repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubcategoryImpl implements SubcategoryPort {

    @Autowired
    private SubcategoryRepository subcategoryRepository;

    @Autowired
    private MapperCategory mapperCategory;

    @Override
    public SubCategory saveCategory(SubCategory category) {
        SubCategoryEntity subCategoryEntity = mapperCategory.subCategoryToSubCategoryEntity(category);
        SubCategoryEntity save = subcategoryRepository.save(subCategoryEntity);
        return mapperCategory.subCategoryEntityToSubCategory(save);
    }
}
