package com.presupuesto.casa.infrastructure.request;

import com.presupuesto.casa.domain.models.Category;
import lombok.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class ExpenseRequest {
    @NotNull(message = "La fecha de ejecución es obligatoria")
    private LocalDate executeExpenseDate;

    @NotNull(message = "El monto es obligatorio")
    @Positive(message = "El monto debe ser mayor a 0")
    private Long amount;

    @NotNull(message = "Debe indicar si es gasto fijo")
    private Boolean fixedExpense;

    @NotBlank(message = "El recurso es obligatorio")
    private String resource;

    @NotNull(message = "Debe indicar si es divisible")
    private Boolean isDivisible;

    @NotNull(message = "Debe especificar la categoría")
    private Category category;
}
