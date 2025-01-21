package com.presupuesto.casa.infrastructure.persistence.expense;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class ExpenseEntity {

    @Id
    private Long id;
    private LocalDateTime executeExpenseDate;
    private Long amount;
    //Es otro objeto
    private Long user;
    //Es otro objeto
    private String category;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;

    public ExpenseEntity(Long id, LocalDateTime executeExpenseDate, Long amount, Long user, String category, Boolean fixedExpense, String resource, Boolean isDivisible) {
        this.id = id;
        this.executeExpenseDate = executeExpenseDate;
        this.amount = amount;
        this.user = user;
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

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
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
                ", user=" + user +
                ", category='" + category + '\'' +
                ", fixedExpense=" + fixedExpense +
                ", resource='" + resource + '\'' +
                ", isDivisible=" + isDivisible +
                '}';
    }
}
