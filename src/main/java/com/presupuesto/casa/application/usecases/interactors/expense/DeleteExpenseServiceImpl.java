package com.presupuesto.casa.application.usecases.interactors.expense;

import com.presupuesto.casa.application.usecases.ports.input.expense.DeleteExpenseService;
import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteExpenseServiceImpl implements DeleteExpenseService {

    @Autowired
    private ExpensePort expensePort;

    @Override
    public void deleteExpense(Long id) {
        expensePort.deleteExpense(id);
    }
}
