package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.expense.DeleteExpenseService;
import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.application.usecases.ports.input.expense.SaveExpenseService;
import com.presupuesto.casa.domain.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class
ExpenseController {

    @Autowired
    private GetExpenseService getExpenseService;

    @Autowired
    private SaveExpenseService saveExpenseService;

    @Autowired
    private DeleteExpenseService deleteExpenseService;

    @GetMapping(path = "/{homeId}", produces = "application/json")
    public ResponseEntity<List<Expense>> getExpensesByHome(
            @PathVariable Long homeId,
            @RequestParam(required = false) String initDate,
            @RequestParam(required = false) String endDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate initDateTime = LocalDate.parse(initDate, formatter);
        LocalDate endDateTime = LocalDate.parse(endDate, formatter);

        List<Expense> expenses = getExpenseService.getExpensesByHome(homeId, initDateTime, endDateTime);

        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    @PostMapping(path = "/save", produces = "application/json")
    public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense) {

        Expense expenseSaved = saveExpenseService.saveExpense(expense);

        return new ResponseEntity<>(expenseSaved, HttpStatus.OK);
    }

    @ResponseStatus
    @DeleteMapping(path = "/{expenseId}/delete", produces = "application/json")
    public void deleteExpense(@PathVariable Long expenseId) {
        deleteExpenseService.deleteExpense(expenseId);
    }
}
