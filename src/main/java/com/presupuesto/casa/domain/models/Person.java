package com.presupuesto.casa.domain.models;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long personId;
    private String name;

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
}
