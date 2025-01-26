package com.presupuesto.casa.application.usecases.ports.input.home;

import com.presupuesto.casa.domain.models.Home;

import java.util.List;

public interface GetHomeService {
    List<Home> getHome(Long homeId);
}
