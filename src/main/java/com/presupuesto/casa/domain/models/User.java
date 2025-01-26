package com.presupuesto.casa.domain.models;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long identifier;
    private String name;

    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
