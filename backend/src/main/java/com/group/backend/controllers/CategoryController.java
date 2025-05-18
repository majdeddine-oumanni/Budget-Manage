package com.group.backend.controllers;

import com.group.backend.DTO.CategoryDTO;
import com.group.backend.Services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public CategoryDTO add(@RequestBody CategoryDTO dto){
        return categoryService.saveCategory(dto);
    }

    @GetMapping
    public List<CategoryDTO> get(){
        return categoryService.getCategories();
    }

    @PutMapping
    public CategoryDTO update(@RequestBody CategoryDTO dto){
        return categoryService.updateCategory(dto);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
}
