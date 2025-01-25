package com.presupuesto.casa.domain.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Home {
    //Cada casa tiene una lista de usuarios asignada,
    // para que solo se puedan asignar gastos a usuarios de esta casa
    private List<User> people;
    //Identificador de la casa: casa new port, casa prado verde
    private Long homeId;
    //Todos los gastos asignados a una casa
    private List<Expense> expenses;
}
