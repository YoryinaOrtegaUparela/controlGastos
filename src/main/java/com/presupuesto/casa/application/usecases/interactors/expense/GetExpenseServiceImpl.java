package com.presupuesto.casa.application.usecases.interactors.expense;

import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GetExpenseServiceImpl implements GetExpenseService {

    private final ExpensePort expensePort;

    public GetExpenseServiceImpl(ExpensePort expensePort) {
        this.expensePort = expensePort;
    }

    @Override
    public List<Expense> getExpenses(Long userID, LocalDateTime initDate, LocalDateTime endDate) {
        return expensePort.getExpensesByUserId(userID);
    }
}
