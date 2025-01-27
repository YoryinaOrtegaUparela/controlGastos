package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface MapperExpense {
    List<Expense> expenseEntityListToExpenseList(List<ExpenseEntity> listExpenseEntity);
    @Mapping(target = "category.categoryId", source = "categoryId")
    Expense expenseEntityToExpense(ExpenseEntity listExpenseEntity);
    @Mapping(target = "categoryId", source = "category.categoryId")
    ExpenseEntity expenseToExpenseEntity(Expense expense);
}
