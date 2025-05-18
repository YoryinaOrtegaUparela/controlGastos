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
    private LocalDate executeExpenseDate;
    private Long amount;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;
    private Category category;
}
