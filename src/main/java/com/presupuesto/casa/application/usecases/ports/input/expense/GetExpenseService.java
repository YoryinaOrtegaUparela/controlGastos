package com.presupuesto.casa.application.usecases.ports.input.expense;

import com.presupuesto.casa.domain.models.Expense;

import java.time.LocalDate;
import java.util.List;

@FunctionalInterface
public interface GetExpenseService {
     List<Expense> getExpensesByHome(Long homeId, LocalDate initDate, LocalDate endDate);
}
