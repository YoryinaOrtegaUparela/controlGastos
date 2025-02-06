package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.expense.DeleteExpenseService;
import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.application.usecases.ports.input.expense.SaveExpenseService;
import com.presupuesto.casa.application.usecases.ports.input.user.DeleteUserService;
import com.presupuesto.casa.application.usecases.ports.input.user.GetUserService;
import com.presupuesto.casa.application.usecases.ports.input.user.SaveUserService;
import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.domain.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private GetUserService getUserService;

    @Autowired
    private SaveUserService saveUserService;

    @Autowired
    private DeleteUserService deleteUserService;

    @GetMapping(path = "/{userId}", produces = "application/json")
    public ResponseEntity<Person> getExpensesByHome(@PathVariable Long userId) {

        Person person = getUserService.getUser(userId);

        return new ResponseEntity<>(person, HttpStatus.OK);
    }


    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Person> saveExpense(@RequestBody Person person) {

        Person personSaved = saveUserService.saveUser(person);

        return new ResponseEntity<>(personSaved, HttpStatus.OK);
    }

    @ResponseStatus
    @DeleteMapping(path = "/{userId}", produces = "application/json")
    public void deleteExpense(@PathVariable Long userId) {
        deleteUserService.deleteUser(userId);
    }
}
