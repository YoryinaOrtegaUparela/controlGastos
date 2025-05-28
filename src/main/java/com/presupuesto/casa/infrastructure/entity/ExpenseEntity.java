package com.presupuesto.casa.infrastructure.entity;

import com.presupuesto.casa.domain.models.Category;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Table(name = "EXPENSE",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ExpenseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate executeExpenseDate;
    private Long amount;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private CategoryEntity category;
}
