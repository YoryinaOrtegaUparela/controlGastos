package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import org.springframework.stereotype.Repository;

// TODO implementar JPA
@Repository
public interface ExpenseRepository {
    ExpenseEntity save(ExpenseEntity expenseEntity);
}
