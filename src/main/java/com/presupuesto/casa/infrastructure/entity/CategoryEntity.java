package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "CategoryEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
}
