package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.category.SaveCategoryService;
import com.presupuesto.casa.infrastructure.request.CategoryRequest;
import com.presupuesto.casa.infrastructure.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private SaveCategoryService saveCategoryService;

    @PostMapping(produces = "application/json")
    public ResponseEntity<CategoryResponse> saveCategory(@RequestBody CategoryRequest categoryRequest) {

        CategoryResponse categorySaved = saveCategoryService.saveCategory(categoryRequest);

        return new ResponseEntity<>(categorySaved, HttpStatus.OK);
    }
}
