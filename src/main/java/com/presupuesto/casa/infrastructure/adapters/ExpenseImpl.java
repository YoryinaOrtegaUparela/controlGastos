package com.presupuesto.casa.infrastructure.adapters;

import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import com.presupuesto.casa.infrastructure.mappers.MapperExpense;
import com.presupuesto.casa.infrastructure.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseImpl implements ExpensePort {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private MapperExpense mapperExpense;

    @Override
    public List<Expense> getExpensesByHomeIdForDate(Long homeId, LocalDate initDate, LocalDate endDate) {
        List<ExpenseEntity> listExpenseEntity =
                expenseRepository.findByHomeIdAndExecuteExpenseDateBetween(homeId, initDate, endDate);
        return mapperExpense.expenseEntityListToExpenseList(listExpenseEntity);
    }

    @Override
    public Expense saveExpense(Expense expense) {
        ExpenseEntity expenseEntity =
                expenseRepository.saveExpense(mapperExpense.expenseToExpenseEntity(expense));
        return mapperExpense.expenseEntityToExpense(expenseEntity);
    }

    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteExpenseById(id);
    }
}
