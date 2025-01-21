package com.presupuesto.casa.infrastructure.persistence.expense;

import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.domain.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseImpl {

    @Autowired
    private final ExpensePort expensePort;

    public ExpenseImpl(ExpensePort expensePort) {
        this.expensePort = expensePort;
    }

    public List<Expense> getExpenses(Long userID, LocalDateTime initDate, LocalDateTime endDate) {
        List<ExpenseEntity> listExpenseEntity = expensePort.getExpensesByUser(userID);
        return mapperExpenseEntityListToExpenseList(listExpenseEntity);
    }

    public List<Expense> mapperExpenseEntityListToExpenseList(List<ExpenseEntity> listExpenseEntity) {
        List<Expense> list = new ArrayList<Expense>();
        for (ExpenseEntity expenseEntity : listExpenseEntity) {
            list.add(mapperExpenseEntityForExpense(expenseEntity));
        }
        return list;
    }


    private Expense mapperExpenseEntityForExpense(ExpenseEntity expenseEntity) {
        return new Expense.BuilderExpense()
                .setExecuteExpenseDate(expenseEntity.getExecuteExpenseDate())
                .setAmount(expenseEntity.getAmount())
                .setUser(new User.BuilderUser().setIdentifier(expenseEntity.getUser()).build())
                .setCategory(new Category())
                .setFixedExpense(expenseEntity.getFixedExpense())
                .setResource(expenseEntity.getResource())
                .setDivisible(expenseEntity.getDivisible())
                .setAmount(expenseEntity.getAmount())
                .build();
    }
}
