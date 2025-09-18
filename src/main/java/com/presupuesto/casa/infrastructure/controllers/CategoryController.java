package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.category.DeleteCategoryService;
import com.presupuesto.casa.application.usecases.ports.input.category.GetCategoryService;
import com.presupuesto.casa.application.usecases.ports.input.category.SaveCategoryService;
import com.presupuesto.casa.infrastructure.request.CategoryRequest;
import com.presupuesto.casa.infrastructure.response.CategoryResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private SaveCategoryService saveCategoryService;

    @Autowired
    private GetCategoryService getCategoryService;

    @Autowired
    private DeleteCategoryService deleteCategoryService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<CategoryResponse>> getCategories() {

        List<CategoryResponse> categories = getCategoryService.getCategories();

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity<CategoryResponse> saveCategory(@RequestBody CategoryRequest categoryRequest) {
        log.info("CategoryRequest: {}", categoryRequest.toString());

        CategoryResponse categorySaved = saveCategoryService.saveCategory(categoryRequest);

        log.info("categorySaved: {}", categorySaved.toString());

        return new ResponseEntity<>(categorySaved, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable Long categoryId) {
        log.info("categoryId: {}", categoryId);
        deleteCategoryService.deleteCategory(categoryId);
    }
}
