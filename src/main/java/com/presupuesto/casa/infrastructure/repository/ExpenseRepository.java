package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
    List<ExpenseEntity> findByHomeIdAndExecuteExpenseDateBetween(Long homeId, LocalDate initDate, LocalDate endDate);
    ExpenseEntity saveExpense(ExpenseEntity expenseEntity);
    void deleteExpenseById(Long id);
}