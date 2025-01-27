package com.presupuesto.casa.domain.models;

import lombok.*;

import java.util.List;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Home {
    private Long homeId;
    private String name;
    private List<Person> personHome;
    private List<Expense> expenses;

    public Long getHomeId() {
        return homeId;
    }

    public void setHomeId(Long homeId) {
        this.homeId = homeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersonHome() {
        return personHome;
    }

    public void setPersonHome(List<Person> personHome) {
        this.personHome = personHome;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
    //Cada casa tiene una lista de usuarios asignada,
    // para que solo se puedan asignar gastos a usuarios de esta casa
    //Identificador de la casa: casa new port, casa prado verde
    //Todos los gastos asignados a una casa
}
