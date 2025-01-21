package com.presupuesto.casa.application.usecases.interactors.expense;

import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.persistence.expense.ExpenseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GetExpenseServiceImpl implements GetExpenseService {

    private final ExpenseImpl expense;

    public GetExpenseServiceImpl(ExpenseImpl expense) {
        this.expense = expense;
    }

    @Override
    public List<Expense> getExpenses(Long userID, LocalDateTime initDate, LocalDateTime endDate) {
        return expense.getExpenses(userID, initDate, endDate);
    }
}
