package com.group.backend.controllers;

import com.group.backend.Services.BudgetService;
import org.springframework.web.bind.annotation.RestController;

public class BudgetController {
    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }
}
