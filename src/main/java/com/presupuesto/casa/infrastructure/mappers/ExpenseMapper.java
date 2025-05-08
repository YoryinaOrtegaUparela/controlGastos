package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import com.presupuesto.casa.infrastructure.request.ExpenseRequest;
import com.presupuesto.casa.infrastructure.response.ExpenseResponse;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {
    Expense requestToExpense(ExpenseRequest expenseRequest);
    ExpenseResponse expenseToResponse(Expense expense);

    ExpenseEntity toEntity(Expense expense);
    Expense entityToExpense(ExpenseEntity expenseEntity);

    List<ExpenseResponse> expensesToResponses(List<Expense> expenses);
    List<Expense> entitiesToExpenses(List<ExpenseEntity> expenseEntities);
}
