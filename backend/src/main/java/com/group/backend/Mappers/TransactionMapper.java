package com.group.backend.Mappers;

import com.group.backend.Entities.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    Transaction toEntity();
}
