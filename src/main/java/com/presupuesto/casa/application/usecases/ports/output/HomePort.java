package com.presupuesto.casa.application.usecases.ports.output;

import com.presupuesto.casa.domain.models.Home;

public interface HomePort {
    Home saveHome(Home home);
    void deleteHome(Long homeId);
}
