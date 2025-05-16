package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "CATEGORY",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
}
