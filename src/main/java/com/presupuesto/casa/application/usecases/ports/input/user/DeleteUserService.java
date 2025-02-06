package com.presupuesto.casa.application.usecases.ports.input.user;

@FunctionalInterface
public interface DeleteUserService {
    void deleteUser(Long id);
}
