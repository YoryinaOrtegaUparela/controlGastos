package com.presupuesto.casa.application.usecases.interactors.expense;

import com.presupuesto.casa.application.usecases.ports.input.expense.SaveExpenseService;
import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveExpenseServiceImpl implements SaveExpenseService {

    @Autowired
    private ExpensePort expensePort;

    @Override
    public Expense saveExpense(Expense expense) {
        return expensePort.saveExpense(expense);
    }
}
