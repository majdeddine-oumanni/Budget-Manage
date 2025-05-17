package com.group.backend.Services;

import com.group.backend.Mappers.BudgetMapper;
import com.group.backend.Repositories.BudgetRepo;

public class BudgetService {
    private final BudgetMapper budgetMapper;
    private final BudgetRepo budgetRepo;

    public BudgetService(BudgetMapper budgetMapper, BudgetRepo budgetRepo) {
        this.budgetMapper = budgetMapper;
        this.budgetRepo = budgetRepo;
    }


}
