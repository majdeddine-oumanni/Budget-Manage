package com.group.backend.Services;

import com.group.backend.DTO.TransactionDTO;
import com.group.backend.Entities.Transaction;
import com.group.backend.Mappers.TransactionMapper;
import com.group.backend.Repositories.TransactionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionMapper transactionMapper;
    private final TransactionRepo transactionRepo;

    public TransactionService(TransactionMapper transactionMapper, TransactionRepo transactionRepo) {
        this.transactionMapper = transactionMapper;
        this.transactionRepo = transactionRepo;
    }

    public List<TransactionDTO> getTransactions(){
        List<Transaction> transactionList = transactionRepo.findAll();
        return transactionMapper.toDTOs(transactionList);
    }

    public TransactionDTO saveTransaction(TransactionDTO dto){
        Transaction transaction = transactionMapper.toEntity(dto);
        Transaction savedTrans = transactionRepo.save(transaction);
        return transactionMapper.toDTO(savedTrans);
    }

    public void deleteTransaction(Long id){
        transactionRepo.deleteById(id);
    }

    public TransactionDTO updateTransaction(TransactionDTO dto){
        Transaction transaction = transactionMapper.toEntity(dto);
        Transaction savedTrans = transactionRepo.save(transaction);
        return transactionMapper.toDTO(savedTrans);
    }
}
