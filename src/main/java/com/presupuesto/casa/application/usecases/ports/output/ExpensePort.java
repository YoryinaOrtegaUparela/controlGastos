package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Expense;

import java.time.LocalDateTime;
import java.util.List;

public interface ExpensePort {
    //TODO comunicación con la persistencia
    public List<Expense> getExpenses(Long userID, LocalDateTime initDate, LocalDateTime endDate);
}
