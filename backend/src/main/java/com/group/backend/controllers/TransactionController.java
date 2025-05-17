package com.group.backend.controllers;

import com.group.backend.Services.TransactionService;

public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
}
