package com.presupuesto.casa.domain.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private String category;
    //seria una lista de subcategory o subcategory contiene una lista de subcategorys
    private SubCategory subCategory;
}
