package com.presupuesto.casa.domain.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long categoryId;
    private String category;
    private SubCategory subCategory;
}
