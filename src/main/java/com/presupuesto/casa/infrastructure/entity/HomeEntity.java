package com.presupuesto.casa.infrastructure.entity;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.domain.models.Person;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Table(name = "HomeEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HomeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long homeId;
    private String name;

    @ManyToMany
    private Set<ExpenseEntity> expenses;

    }
