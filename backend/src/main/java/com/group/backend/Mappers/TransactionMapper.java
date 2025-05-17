package com.group.backend.Mappers;

import com.group.backend.DTO.TransactionDTO;
import com.group.backend.Entities.Transaction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    Transaction toEntity(TransactionDTO dto);
    TransactionDTO toDTO(Transaction transaction);
    List<TransactionDTO> toDTOs(List<Transaction> transactionList);
}
