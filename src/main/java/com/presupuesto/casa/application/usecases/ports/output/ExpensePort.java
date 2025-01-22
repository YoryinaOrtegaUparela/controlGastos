package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;

import java.util.List;


public interface ExpensePort {
    List<Expense>  getExpensesByUserId(Long userID);
}
