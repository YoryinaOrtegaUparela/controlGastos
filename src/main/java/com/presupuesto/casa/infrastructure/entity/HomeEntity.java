package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "HomeEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HomeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long homeId;

    private Long identifierUser;

    public Long getHomeId() {
        return homeId;
    }

    public void setHomeId(Long homeId) {
        this.homeId = homeId;
    }

    public Long getIdentifierUser() {
        return identifierUser;
    }

    public void setIdentifierUser(Long identifierUser) {
        this.identifierUser = identifierUser;
    }
}
