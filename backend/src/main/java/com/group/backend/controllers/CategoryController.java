package com.group.backend.controllers;

import com.group.backend.Services.CategoryService;
import org.springframework.web.bind.annotation.RestController;


public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
