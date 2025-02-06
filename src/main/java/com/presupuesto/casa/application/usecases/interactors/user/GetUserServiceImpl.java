package com.presupuesto.casa.application.usecases.interactors.user;

import com.presupuesto.casa.application.usecases.ports.input.user.GetUserService;
import com.presupuesto.casa.domain.models.Person;
import org.springframework.stereotype.Service;

@Service
public class GetUserServiceImpl implements GetUserService {
    @Override
    public Person getUser(Long id) {
        return null;
    }
}
