package com.presupuesto.casa.application.usecases.interactors.expense;

import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class GetExpenseServiceImpl implements GetExpenseService {

    @Autowired
    private ExpensePort expensePort;

    @Override
    public List<Expense> getExpensesByHome(Long homeId, LocalDate initDate, LocalDate endDate) {
        return expensePort.getExpensesByHomeIdForDate(homeId, initDate, endDate);
    }
}
