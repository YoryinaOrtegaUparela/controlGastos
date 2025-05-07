package com.presupuesto.casa.infrastructure.adapters;

import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseImpl implements ExpensePort {

    @Override
    public List<Expense> getExpensesByHomeIdForDate(Long homeId, LocalDate initDate, LocalDate endDate) {
        return List.of();
    }

    @Override
    public Expense saveExpense(Expense expense) {
        return null;
    }

    @Override
    public void deleteExpense(Long id) {

    }
}
