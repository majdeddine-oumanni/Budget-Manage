package com.group.backend.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.group.backend.Entities.Budget;
import com.group.backend.Entities.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class CategoryDTO {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    private Long id;
    private String categoryName;
    //private List<Transaction> transactions;
    //private Budget budget;
}
