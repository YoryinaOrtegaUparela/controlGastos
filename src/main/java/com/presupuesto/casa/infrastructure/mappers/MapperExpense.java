package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperExpense {
    @Mapping(target = "person.personId", source = "identifierUser")
    Expense expenseEntityToExpense(ExpenseEntity listExpenseEntity);
    List<Expense> expenseEntityListToExpenseList(List<ExpenseEntity> listExpenseEntity);
    ExpenseEntity expenseToExpenseEntity(Expense expense);
}
