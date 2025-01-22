package com.presupuesto.casa.infrastructure;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "JERARQUIA")
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

    private Long idpadre;
    private Long idhijo;
}
