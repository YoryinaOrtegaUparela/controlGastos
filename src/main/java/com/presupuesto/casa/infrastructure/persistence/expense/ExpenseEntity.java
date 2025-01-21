package com.presupuesto.casa.infrastructure.persistence.expense;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.*;

@Table(name = "ExpenseEntity",schema = "ALGO")
@Entity
@Builder
@ToString
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime executeExpenseDate;
    private Long amount;
    //Es otro objeto
    //TODO corregir el tema del usuario

    //Es otro objeto
    private String category;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;

    public ExpenseEntity(Long id, LocalDateTime executeExpenseDate, Long amount, String category, Boolean fixedExpense, String resource, Boolean isDivisible) {
        this.id = id;
        this.executeExpenseDate = executeExpenseDate;
        this.amount = amount;
        this.category = category;
        this.fixedExpense = fixedExpense;
        this.resource = resource;
        this.isDivisible = isDivisible;
    }

    public ExpenseEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getExecuteExpenseDate() {
        return executeExpenseDate;
    }

    public void setExecuteExpenseDate(LocalDateTime executeExpenseDate) {
        this.executeExpenseDate = executeExpenseDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }





    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    @Override
    public String toString() {
        return "ExpenseEntity{" +
                "id=" + id +
                ", executeExpenseDate=" + executeExpenseDate +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", fixedExpense=" + fixedExpense +
                ", resource='" + resource + '\'' +
                ", isDivisible=" + isDivisible +
                '}';
    }
}
