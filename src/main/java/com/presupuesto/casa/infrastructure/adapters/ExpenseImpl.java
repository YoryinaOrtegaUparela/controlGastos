package com.presupuesto.casa.infrastructure.adapters;

import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import com.presupuesto.casa.infrastructure.mappers.ExpenseMapper;
import com.presupuesto.casa.infrastructure.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseImpl implements ExpensePort {

    @Autowired
    private ExpenseMapper expenseMapper;

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> getExpensesForDate(LocalDate initDate, LocalDate endDate) {
        List<ExpenseEntity> expenseEntityList = expenseRepository.findByExecuteExpenseDateBetween(initDate, endDate);

        return expenseMapper.entitiesToExpenses(expenseEntityList);
    }

    @Override
    public Expense saveExpense(Expense expense) {
        ExpenseEntity expenseEntity = expenseMapper.toEntity(expense);
        ExpenseEntity expenseSaved = expenseRepository.save(expenseEntity);

        return expenseMapper.entityToExpense(expenseSaved);
    }

    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
