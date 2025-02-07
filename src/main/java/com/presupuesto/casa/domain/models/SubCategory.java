package com.presupuesto.casa.domain.models;

import lombok.*;

import java.util.List;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SubCategory {
    private Long id;
    private String subCategoryName;
    private Long idCategory;

}
