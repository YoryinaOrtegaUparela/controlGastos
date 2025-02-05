package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    @OneToOne
    private HomeEntity homeId;

    private LocalDate executeExpenseDate;

    private Long amount;

    private Long personId;

    @OneToOne
    private CategoryEntity category;

    private Boolean fixedExpense;

    private String resource;

    private Boolean isDivisible;

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HomeEntity getHomeId() {
        return homeId;
    }

    public void setHomeId(HomeEntity homeId) {
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

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long identifierUser) {
        this.personId = identifierUser;
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

    public Boolean getIsDivisible() {
        return isDivisible;
    }

    public void setIsDivisible(Boolean divisible) {
        isDivisible = divisible;
    }
}
