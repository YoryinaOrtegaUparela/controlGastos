package com.presupuesto.casa.infrastructure.response;

import com.presupuesto.casa.domain.models.Category;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ExpenseResponse {
    private Long id;
    private LocalDate executeExpenseDate;
    private Long amount;
    private Boolean fixedExpense;
    private String resource;
    private Boolean isDivisible;
    private Category category;
}
