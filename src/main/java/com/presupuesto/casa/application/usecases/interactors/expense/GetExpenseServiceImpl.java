package com.presupuesto.casa.application.usecases.interactors.expense;

import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.mappers.ExpenseMapper;
import com.presupuesto.casa.infrastructure.response.ExpenseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class GetExpenseServiceImpl implements GetExpenseService {

    @Autowired
    private ExpenseMapper expenseMapper;

    @Autowired
    private ExpensePort expensePort;

    @Override
    public List<ExpenseResponse> getExpensesForDate(LocalDate initDate, LocalDate endDate) {
        List<Expense> expenseList = expensePort.getExpensesForDate(initDate, endDate);
        return expenseMapper.expensesToResponses(expenseList);
    }
}
