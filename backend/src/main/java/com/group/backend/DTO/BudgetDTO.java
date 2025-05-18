package com.group.backend.DTO;

import com.group.backend.Entities.Category;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BudgetDTO {
    private double amount;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private Category category;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
