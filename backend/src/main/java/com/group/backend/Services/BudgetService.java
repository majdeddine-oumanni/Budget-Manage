package com.group.backend.Services;

import com.group.backend.DTO.BudgetDTO;
import com.group.backend.Entities.Budget;
import com.group.backend.Mappers.BudgetMapper;
import com.group.backend.Repositories.BudgetRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    private final BudgetMapper budgetMapper;
    private final BudgetRepo budgetRepo;

    public BudgetService(BudgetMapper budgetMapper, BudgetRepo budgetRepo) {
        this.budgetMapper = budgetMapper;
        this.budgetRepo = budgetRepo;
    }

    public BudgetDTO saveBudget(BudgetDTO dto){
        Budget budget = budgetMapper.toEntity(dto);
        Budget savedBudget = budgetRepo.save(budget);
        return budgetMapper.toDTO(savedBudget);
    }
    public List<BudgetDTO> getBudgets(){
        List<Budget> budgetList = budgetRepo.findAll();
        return budgetMapper.toDTOs(budgetList);
    }

    public BudgetDTO updateBudget(BudgetDTO dto){
        Budget budget = budgetMapper.toEntity(dto);
        Budget savedBudget = budgetRepo.save(budget);
        return budgetMapper.toDTO(savedBudget);
    }

    public void deleteBudget(Long id){
        budgetRepo.deleteById(id);
    }
}
