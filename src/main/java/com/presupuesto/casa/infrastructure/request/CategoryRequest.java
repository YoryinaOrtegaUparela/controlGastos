package com.presupuesto.casa.infrastructure.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CategoryRequest {
    private String category;
    private String subCategory;
}
