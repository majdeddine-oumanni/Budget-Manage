package com.group.backend.Services;

import com.group.backend.Mappers.CategoryMapper;
import com.group.backend.Repositories.CategoryRepo;

public class CategoryService {
    private final CategoryMapper categoryMapper;
    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryMapper categoryMapper, CategoryRepo categoryRepo) {
        this.categoryMapper = categoryMapper;
        this.categoryRepo = categoryRepo;
    }
}
