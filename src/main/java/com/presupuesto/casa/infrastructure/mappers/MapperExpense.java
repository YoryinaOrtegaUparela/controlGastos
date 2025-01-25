package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MapperExpense {
    List<Expense> expenseEntityListToExpenseList(List<ExpenseEntity> listExpenseEntity);
    Expense expenseEntityToExpense(ExpenseEntity listExpenseEntity);
    ExpenseEntity expenseToExpenseEntity(Expense expense);
}
