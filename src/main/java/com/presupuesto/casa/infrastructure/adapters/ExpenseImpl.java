package com.presupuesto.casa.infrastructure.adapters;

import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Category;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.domain.models.User;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import com.presupuesto.casa.infrastructure.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseImpl implements ExpensePort  {


    @Autowired
    private ExpenseRepository expenseRepository;


    @Override
    public List<Expense> getExpensesByUserId(Long userID) {
        List<ExpenseEntity> listExpenseEntity = expenseRepository.getExpensesByAmount(userID);
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
