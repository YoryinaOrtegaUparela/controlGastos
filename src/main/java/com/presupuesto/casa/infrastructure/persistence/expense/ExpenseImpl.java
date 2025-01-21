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
        List<ExpenseEntity> listExpenseEntity = expensePort.getExpensesByAmount(userID);
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
        return  Expense.builder()
                .executeExpenseDate(expenseEntity.getExecuteExpenseDate())
                .amount(expenseEntity.getAmount())
                .user(User.builder().identifier(expenseEntity.getIdentifierUser()).build())
                .category(Category.builder().build())
                .fixedExpense(expenseEntity.getFixedExpense())
                .resource(expenseEntity.getResource())
                .isDivisible(expenseEntity.getIsDivisible())
                .build();
    }
}
