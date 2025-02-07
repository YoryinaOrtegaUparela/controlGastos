package com.presupuesto.casa.domain.models;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class Expense {
    private Long id;
    private Home homeId;
    private LocalDate executeExpenseDate;
    private Long amount;
    private Person person;
    private Category category;
    private Boolean fixedExpense;
    // TODO información del link de pago y NIC del recibo
    private String resource;
    private Boolean isDivisible;


}
