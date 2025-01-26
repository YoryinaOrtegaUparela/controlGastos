package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "ExpenseEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long homeId;
    private LocalDate executeExpenseDate;
    private Long amount;
    //Es otro objeto
    private Long identifierUser;
    //Es otro objeto
    // private String category;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHomeId() {
        return homeId;
    }

    public void setHomeId(Long homeId) {
        this.homeId = homeId;
    }

    public LocalDate getExecuteExpenseDate() {
        return executeExpenseDate;
    }

    public void setExecuteExpenseDate(LocalDate executeExpenseDate) {
        this.executeExpenseDate = executeExpenseDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getIdentifierUser() {
        return identifierUser;
    }

    public void setIdentifierUser(Long identifierUser) {
        this.identifierUser = identifierUser;
    }

    public Boolean getFixedExpense() {
        return fixedExpense;
    }

    public void setFixedExpense(Boolean fixedExpense) {
        this.fixedExpense = fixedExpense;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Boolean getDivisible() {
        return isDivisible;
    }

    public void setDivisible(Boolean divisible) {
        isDivisible = divisible;
    }
}
