package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.category.DeleteCategoryService;
import com.presupuesto.casa.application.usecases.ports.input.category.GetCategoryService;
import com.presupuesto.casa.application.usecases.ports.input.category.SaveCategoryService;
import com.presupuesto.casa.domain.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    // entregamos la lista de categorias, editar, agregar, borrar categorias
    @Autowired
    private GetCategoryService getCategoryService;

    @Autowired
    private SaveCategoryService saveCategoryService;

    @Autowired
    private DeleteCategoryService deleteCategoryService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Category>> getCategories() {

        List<Category> categories = getCategoryService.getCategories();

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Category> saveCategory(@RequestBody Category category) {

        Category categorySaved = saveCategoryService.saveCategory(category);

        return new ResponseEntity<>(categorySaved, HttpStatus.OK);
    }

    @ResponseStatus
    @DeleteMapping(path = "/{categoryId}", produces = "application/json")
    public void deleteCategory(@PathVariable Long categoryId) {
        deleteCategoryService.deleteCategory(categoryId);
    }
}
