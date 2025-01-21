package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.infrastructure.persistence.expense.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Repository interface for Expense entity.
 * Provides CRUD operations and custom query methods through JpaRepository.
 */
@Repository
public interface ExpensePort extends JpaRepository<ExpenseEntity, Long> {
    List<ExpenseEntity> getExpensesByUser(Long userID);
}
