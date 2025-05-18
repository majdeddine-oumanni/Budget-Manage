package com.group.backend.DTO;
import com.group.backend.Entities.Category;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
public class TransactionDTO {
    private double amount;
    private Date date;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private String description;
    private Category category;
}
