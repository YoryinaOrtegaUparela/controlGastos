package com.presupuesto.casa.application.usecases.interactors.expense;

import com.presupuesto.casa.application.usecases.ports.input.expense.SaveExpenseService;
import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.mappers.ExpenseMapper;
import com.presupuesto.casa.infrastructure.request.ExpenseRequest;
import com.presupuesto.casa.infrastructure.response.ExpenseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveExpenseServiceImpl implements SaveExpenseService {

    @Autowired
    private ExpensePort expensePort;

    @Autowired
    private ExpenseMapper expenseMapper;

    @Override
    public ExpenseResponse saveExpense(ExpenseRequest expenseRequest) {

        Expense expense = expenseMapper.requestToExpense(expenseRequest);
        Expense expenseSaved = expensePort.saveExpense(expense);

        return expenseMapper.expenseToResponse(expenseSaved);
    }
}
