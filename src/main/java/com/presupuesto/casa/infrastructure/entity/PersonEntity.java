package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Table(name = "PersonEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long personId;

    private String name;

    @ManyToMany
    private Set<HomeEntity> homesPerson;

    @ManyToMany
    private Set<ExpenseEntity> expensesPerson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Set<HomeEntity> getHomesPerson() {
        return homesPerson;
    }

    public void setHomesPerson(Set<HomeEntity> homeEntities) {
        this.homesPerson = homeEntities;
    }

    public Set<ExpenseEntity> getExpensesPerson() {
        return expensesPerson;
    }

    public void setExpensesPerson(Set<ExpenseEntity> expenseEntities) {
        this.expensesPerson = expenseEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
