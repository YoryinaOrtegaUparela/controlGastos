package com.presupuesto.casa.domain.models;

import lombok.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Expense {
    private Long id;
    private Long homeId;
    private LocalDate executeExpenseDate;
    private Long amount;
    private Person person;
    private Category category;
    private Boolean fixedExpense;
    // TODO información del link de pago y NIC del recibo
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
