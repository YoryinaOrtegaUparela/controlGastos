package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "ExpenseEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private HomeEntity homeId;

    private LocalDate executeExpenseDate;

    private Long amount;

    private Long personId;

    @OneToOne
    private CategoryEntity category;

    private Boolean fixedExpense;

    private String resource;

    private Boolean isDivisible;


}
