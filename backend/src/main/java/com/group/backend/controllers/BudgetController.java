package com.group.backend.controllers;

import com.group.backend.DTO.BudgetDTO;
import com.group.backend.Services.BudgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/budget")
public class BudgetController {
    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping
    public List<BudgetDTO> getBudgetList(){
        return budgetService.getBudgets();
    }

    @PostMapping
    public BudgetDTO addBudget(@RequestBody BudgetDTO budgetDTO){
        return budgetService.saveBudget(budgetDTO);
    }

    @PutMapping
    public BudgetDTO modifieBudget(@RequestBody BudgetDTO budgetDTO){
        return budgetService.updateBudget(budgetDTO);
    }

    @DeleteMapping("/{id}")
    public void removeBudget(@PathVariable Long id){
        budgetService.deleteBudget(id);
    }
}
