package com.group.backend.Repositories;
import com.group.backend.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
}
