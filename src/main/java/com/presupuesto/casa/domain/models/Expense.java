package com.presupuesto.casa.domain.models;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Expense {
    // TODO dejar solo lo basico sin depender de otros objetos
    private Long id;
    private Long homeId;
    private LocalDate executeExpenseDate;
    private Long amount;
    private User user;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;
}
