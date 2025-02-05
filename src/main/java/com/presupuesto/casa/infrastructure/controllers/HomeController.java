package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.home.DeleteHomeService;
import com.presupuesto.casa.application.usecases.ports.input.home.GetHomeService;
import com.presupuesto.casa.application.usecases.ports.input.home.SaveHomeService;
import com.presupuesto.casa.domain.models.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private GetHomeService getHomeService;

    @Autowired
    private SaveHomeService saveHomeService;

    @Autowired
    private DeleteHomeService deleteHomeService;

    @GetMapping(path = "/{userId}", produces = "application/json")
    public ResponseEntity<List<Home>> getHome(@PathVariable Long userId) {

        List<Home> homes = getHomeService.getHome(userId);
        return new ResponseEntity<>(homes, HttpStatus.OK);
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Home> saveHome(@RequestBody Home home) {

        Home homeSaved = saveHomeService.saveHome(home);

        return new ResponseEntity<>(homeSaved, HttpStatus.OK);
    }

    @ResponseStatus
    @DeleteMapping(path = "/{expenseId}", produces = "application/json")
    public void deleteHome(@PathVariable Long homeId) {
        deleteHomeService.deleteHome(homeId);
    }
}
