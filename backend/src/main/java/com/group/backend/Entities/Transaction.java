package com.group.backend.Entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Entity
@Setter
@Getter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private Date date;
    private String description;
    
}
