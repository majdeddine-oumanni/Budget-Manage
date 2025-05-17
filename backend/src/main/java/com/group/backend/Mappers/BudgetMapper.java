package com.group.backend.Mappers;

import com.group.backend.DTO.BudgetDTO;
import com.group.backend.Entities.Budget;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BudgetMapper {
    Budget toEntity(BudgetDTO dto);
    BudgetDTO toDTO(Budget budget);
    List<BudgetDTO> toDTOs(List<Budget> budgetList);
}
