package com.presupuesto.casa.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long id;
    private Long personId;
    private String name;
    private List<Home> homesPerson;
    private List<Expense> expensesPerson;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Home> getHomesPerson() {
        return homesPerson;
    }

    public void setHomesPerson(List<Home> homesPerson) {
        this.homesPerson = homesPerson;
    }

    public List<Expense> getExpensesPerson() {
        return expensesPerson;
    }

    public void setExpensesPerson(List<Expense> expensesPerson) {
        this.expensesPerson = expensesPerson;
    }
}
