package com.presupuesto.casa.domain.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Category {
    private Long id;
    private String category;
}
