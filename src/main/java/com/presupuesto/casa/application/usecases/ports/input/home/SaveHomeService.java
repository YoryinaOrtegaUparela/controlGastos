package com.presupuesto.casa.application.usecases.ports.input.home;

import com.presupuesto.casa.domain.models.Home;

public interface SaveHomeService {
    Home saveHome(Home home);
}
