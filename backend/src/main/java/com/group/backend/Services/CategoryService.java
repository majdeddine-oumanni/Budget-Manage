package com.group.backend.Services;

import com.group.backend.DTO.CategoryDTO;
import com.group.backend.Entities.Category;
import com.group.backend.Mappers.CategoryMapper;
import com.group.backend.Repositories.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryMapper categoryMapper;
    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryMapper categoryMapper, CategoryRepo categoryRepo) {
        this.categoryMapper = categoryMapper;
        this.categoryRepo = categoryRepo;
    }
    public CategoryDTO saveCategory(CategoryDTO dto){
        Category category = categoryMapper.toEntity(dto);
        Category savedCategory = categoryRepo.save(category);
        return categoryMapper.toDTO(savedCategory);
    }
    public List<CategoryDTO> getCategories(){
        List<Category> categories = categoryRepo.findAll();
        return categoryMapper.toDTOs(categories);
    }

    public CategoryDTO updateCategory(CategoryDTO dto){
        Category category = categoryMapper.toEntity(dto);
        Category savedCategory = categoryRepo.save(category);
        return categoryMapper.toDTO(savedCategory);
    }

    public void deleteCategory(Long id){
        categoryRepo.deleteById(id);
    }
}
