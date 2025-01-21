package com.presupuesto.casa.domain.models;

import java.util.List;

public class Home {
    //Cada casa tiene una lista de usuarios asignada,
    // para que solo se puedan asignar gastos a usuarios de esta casa
    private List<User> users;
    //Identificador de la casa: casa new port, casa prado verde
    private String identifier;
    //Todos los gastos asignados a una casa
    private List<Expense> expenses;
}
