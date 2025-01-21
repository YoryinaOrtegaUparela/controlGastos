package com.presupuesto.casa.domain.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long identifier;
    private String name;
    private String email;
}
