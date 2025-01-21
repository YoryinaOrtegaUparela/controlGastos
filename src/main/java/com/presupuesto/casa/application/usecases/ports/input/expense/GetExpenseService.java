package com.presupuesto.casa.application.usecases.ports.input.expense;

import com.presupuesto.casa.domain.models.Expense;

import java.time.LocalDateTime;
import java.util.List;

@FunctionalInterface
public interface GetExpenseService {
     public List<Expense> getExpenses(Long userID, LocalDateTime initDate, LocalDateTime endDate);
}
