package com.presupuesto.casa.application.usecases.interactors.home;

import com.presupuesto.casa.application.usecases.ports.input.home.GetHomeService;
import com.presupuesto.casa.application.usecases.ports.output.HomePort;
import com.presupuesto.casa.domain.models.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetGetHomeServiceImpl implements GetHomeService {

    @Autowired
    private HomePort homePort;

    @Override
    public List<Home> getHome(Long userId) {
        return homePort.getHomeByIdentifierUser(userId);
    }
}
