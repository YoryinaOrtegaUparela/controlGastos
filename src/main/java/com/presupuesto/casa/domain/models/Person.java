package com.presupuesto.casa.domain.models;

import lombok.*;

import java.util.List;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Person {
    private Long id;
    private Long personId;
    private String name;
    private List<Home> homesPerson;
    private List<Expense> expensesPerson;

}
