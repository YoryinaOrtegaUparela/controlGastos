package com.presupuesto.casa.infrastructure.entity;

import com.presupuesto.casa.domain.models.Expense;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    @OneToMany(mappedBy = "category")
    private List<ExpenseEntity> expenses;
}
