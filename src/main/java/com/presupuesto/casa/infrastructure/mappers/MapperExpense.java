package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.domain.models.Home;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import com.presupuesto.casa.infrastructure.entity.HomeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperExpense {
    @Mapping(target = "person.personId", source = "personId")
    @Mapping(target = "category.categoryId", source = "category.categoryId")
    Expense expenseEntityToExpense(ExpenseEntity listExpenseEntity);
    List<Expense> expenseEntityListToExpenseList(List<ExpenseEntity> listExpenseEntity);

    @Mapping(target = "personId", source = "person.personId")
    ExpenseEntity expenseToExpenseEntity(Expense expense);

    Home homeToHomeEntity(HomeEntity homeEntity);
    HomeEntity homeEntityToHome(Home home);
}
