package com.presupuesto.casa.infrastructure.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CategoryResponse {
    private Long id;
    private String category;
}
