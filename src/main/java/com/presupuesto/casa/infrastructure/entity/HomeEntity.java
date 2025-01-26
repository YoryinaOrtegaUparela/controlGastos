package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "HomeEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HomeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long homeId;
}
