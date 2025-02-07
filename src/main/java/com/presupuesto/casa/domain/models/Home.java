package com.presupuesto.casa.domain.models;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Home {
    private Long homeId;
    private String name;
    private Long personId;


    //Cada casa tiene una lista de usuarios asignada,
    // para que solo se puedan asignar gastos a usuarios de esta casa
    //Identificador de la casa: casa new port, casa prado verde
    //Todos los gastos asignados a una casa
}
