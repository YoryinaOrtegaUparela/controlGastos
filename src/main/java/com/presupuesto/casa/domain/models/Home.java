package com.presupuesto.casa.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Home {
    private Long homeId;
    private String name;
    private Long personId;

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

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    //Cada casa tiene una lista de usuarios asignada,
    // para que solo se puedan asignar gastos a usuarios de esta casa
    //Identificador de la casa: casa new port, casa prado verde
    //Todos los gastos asignados a una casa
}
