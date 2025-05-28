package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
    List<ExpenseEntity> findByExecuteExpenseDateBetween(LocalDate startDate, LocalDate endDate);
}
