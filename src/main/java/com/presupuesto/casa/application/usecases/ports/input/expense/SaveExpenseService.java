package com.presupuesto.casa.application.usecases.ports.input.expense;

import com.presupuesto.casa.infrastructure.request.ExpenseRequest;
import com.presupuesto.casa.infrastructure.response.ExpenseResponse;

@FunctionalInterface
public interface SaveExpenseService {
    ExpenseResponse saveExpense(ExpenseRequest expenseRequest);
}
