package com.presupuesto.casa.infrastructure;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "TABLA2")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OtraTabaTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
