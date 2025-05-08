package com.presupuesto.casa.application.usecases.ports.input.expense;

import com.presupuesto.casa.infrastructure.response.ExpenseResponse;

import java.time.LocalDate;
import java.util.List;

@FunctionalInterface
public interface GetExpenseService {
     List<ExpenseResponse> getExpensesForDate(LocalDate initDate, LocalDate endDate);
}
