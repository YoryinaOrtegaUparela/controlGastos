package com.presupuesto.casa.application.usecases.ports.input.user;

import com.presupuesto.casa.domain.models.Person;

@FunctionalInterface
public interface GetUserService {
    Person getUser(Long id);
}
