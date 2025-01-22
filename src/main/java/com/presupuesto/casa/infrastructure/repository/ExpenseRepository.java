package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
    List<ExpenseEntity> getExpensesByAmount(Long userID);
}