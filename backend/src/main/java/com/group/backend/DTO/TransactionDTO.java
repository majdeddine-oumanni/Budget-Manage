package com.group.backend.DTO;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
public class TransactionDTO {
    private double amount;
    private Date date;
    private String description;

}
