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
    private Long id;
    private Long homeId;
    private LocalDate executeExpenseDate;
    private Long amount;
    private User user;
    // private Category category;
    private Boolean fixedExpense;
    // TODO información del link de pago y NIC del recibo
    private String resource;
    private Boolean isDivisible;
}
