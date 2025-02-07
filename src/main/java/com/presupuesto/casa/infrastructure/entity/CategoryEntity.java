package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Table(name = "CategoryEntity",schema = "EXPENSES")
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
    private Long categoryId;

    private String categoryName;


}
