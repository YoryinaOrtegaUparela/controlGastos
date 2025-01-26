package com.presupuesto.casa.application.usecases.interactors.home;

import com.presupuesto.casa.application.usecases.ports.input.home.SaveHomeService;
import com.presupuesto.casa.application.usecases.ports.output.HomePort;
import com.presupuesto.casa.domain.models.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveHomeServiceImpl implements SaveHomeService {

    @Autowired
    private HomePort homePort;

    @Override
    public Home saveHome(Home home) {
        return homePort.saveHome(home);
    }
}
