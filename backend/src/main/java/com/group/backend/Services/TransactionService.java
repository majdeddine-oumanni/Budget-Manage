package com.group.backend.Services;

import com.group.backend.Mappers.TransactionMapper;
import com.group.backend.Repositories.TransactionRepo;

public class TransactionService {
    private final TransactionMapper transactionMapper;
    private final TransactionRepo transactionRepo;

    public TransactionService(TransactionMapper transactionMapper, TransactionRepo transactionRepo) {
        this.transactionMapper = transactionMapper;
        this.transactionRepo = transactionRepo;
    }
}
