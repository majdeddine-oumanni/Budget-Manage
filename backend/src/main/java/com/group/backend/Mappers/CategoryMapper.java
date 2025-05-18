package com.group.backend.Mappers;

import com.group.backend.DTO.CategoryDTO;
import com.group.backend.Entities.Category;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")

public interface CategoryMapper {
    Category toEntity(CategoryDTO dto);
    CategoryDTO toDTO(Category category);
    List<CategoryDTO> toDTOs(List<Category> categoryList);
}
