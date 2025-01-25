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
@Getter
@Setter
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long homeId;
    private LocalDate executeExpenseDate;
    private Long amount;
    //Es otro objeto
    private Long identifierUser;
    //Es otro objeto
    // private String category;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;
}
