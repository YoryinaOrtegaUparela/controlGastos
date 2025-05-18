package com.presupuesto.casa.infrastructure.request;

import com.presupuesto.casa.domain.models.Category;
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
    private Category category;
}
