package com.presupuesto.casa.infrastructure.request;

import lombok.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class ExpenseRequest {
    private LocalDate executeExpenseDate;
    private Long amount;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;
}
