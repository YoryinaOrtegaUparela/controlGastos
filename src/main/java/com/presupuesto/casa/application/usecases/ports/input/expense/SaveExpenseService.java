package com.presupuesto.casa.application.usecases.ports.input.expense;

import com.presupuesto.casa.domain.models.Expense;

@FunctionalInterface
public interface SaveExpenseService {
    Expense saveExpense(Expense expense);
}
