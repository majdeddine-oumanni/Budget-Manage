package com.group.backend.controllers;

import com.group.backend.DTO.TransactionDTO;
import com.group.backend.Services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<TransactionDTO> getTrans(){
        return transactionService.getTransactions();
    }

    @PostMapping
    public TransactionDTO addTrans(@RequestBody TransactionDTO dto){
        return transactionService.saveTransaction(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTrans(@PathVariable Long id){
        transactionService.deleteTransaction(id);
    }

    @PutMapping
    public TransactionDTO updateTrans(@RequestBody TransactionDTO dto){
        return transactionService.saveTransaction(dto);
    }
}
