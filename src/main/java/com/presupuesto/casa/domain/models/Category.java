package com.presupuesto.casa.domain.models;

import lombok.*;

import java.util.List;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Category {
    private Long categoryId;
    private String categoryName;

}
