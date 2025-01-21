package com.presupuesto.casa.infrastructure;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "TABLA_EJEMPLO",schema = "ALGO")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EntityTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
