package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Home;

import java.util.List;

public interface HomePort {
    List<Home> getHomeByIdentifierUser(Long identifierUser);
    Home saveHome(Home home);
    void deleteHome(Long homeId);
}
