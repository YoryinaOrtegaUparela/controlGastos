package com.presupuesto.casa.infrastructure.adapters;

import com.presupuesto.casa.application.usecases.ports.output.HomePort;
import com.presupuesto.casa.domain.models.Home;
import com.presupuesto.casa.infrastructure.mappers.MapperHome;
import com.presupuesto.casa.infrastructure.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeImpl implements HomePort {

    @Autowired
    private HomeRepository homeRepository;

    @Autowired
    private MapperHome mapperHome;

    @Override
    public List<Home> getHomeByIdentifierUser(Long identifierUser) {
        return mapperHome.homeEntityListToHomeList(homeRepository.findByIdentifierUser(identifierUser));
    }

    @Override
    public Home saveHome(Home home) {
        return mapperHome.homeEntityToHome(homeRepository.save(mapperHome.homeToHomeEntity(home)));
    }

    @Override
    public void deleteHome(Long homeId) {
        homeRepository.deleteByHomeId(homeId);
    }
}
