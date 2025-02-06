package com.presupuesto.casa.application.usecases.interactors.user;

import com.presupuesto.casa.application.usecases.ports.input.user.SaveUserService;
import com.presupuesto.casa.domain.models.Person;
import org.springframework.stereotype.Service;

@Service
public class SaveUserServiceImpl implements SaveUserService {
    @Override
    public Person saveUser(Person person) {
        return null;
    }
}
