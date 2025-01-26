package com.presupuesto.casa.application.usecases.interactors.home;

import com.presupuesto.casa.application.usecases.ports.input.home.DeleteHomeService;
import com.presupuesto.casa.application.usecases.ports.output.HomePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteHomeServiceImpl implements DeleteHomeService {

    @Autowired
    private HomePort homePort;

    @Override
    public void deleteHome(Long homeId) {
        homePort.deleteHome(homeId);
    }
}
