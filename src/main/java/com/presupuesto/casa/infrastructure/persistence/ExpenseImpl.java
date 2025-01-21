package com.presupuesto.casa.infrastructure.persistence;

import com.presupuesto.casa.application.usecases.ports.output.ExpensePort;
import com.presupuesto.casa.domain.models.Expense;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseImpl implements ExpensePort {
    @Override
    public List<Expense> getExpenses(Long userID, LocalDateTime initDate, LocalDateTime endDate) {
        List<Expense> list = new ArrayList<Expense>();

        Expense expense =  new Expense.BuilderExpense().setAmount(45L).build();
        Expense expense2 =  new Expense.BuilderExpense().setAmount(45L).build();


        list.add(expense);
       list.add(expense2);

        return list;
    }
}
