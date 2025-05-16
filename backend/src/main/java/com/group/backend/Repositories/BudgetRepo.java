package com.group.backend.Repositories;
import com.group.backend.Entities.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepo extends JpaRepository<Budget, Long> {
}
