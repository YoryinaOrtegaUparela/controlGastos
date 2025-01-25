package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Expense;
import java.time.LocalDate;
import java.util.List;


public interface ExpensePort {
    List<Expense> getExpensesByHomeIdForDate(Long homeId, LocalDate initDate, LocalDate endDate);
    Expense saveExpense(Expense expense);
    void deleteExpense(Long id);
}
