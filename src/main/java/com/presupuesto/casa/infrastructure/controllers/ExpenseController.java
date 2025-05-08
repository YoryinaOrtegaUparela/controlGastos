package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.expense.DeleteExpenseService;
import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.application.usecases.ports.input.expense.SaveExpenseService;
import com.presupuesto.casa.infrastructure.request.ExpenseRequest;
import com.presupuesto.casa.infrastructure.response.ExpenseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/expense")
public class
ExpenseController {

    @Autowired
    private GetExpenseService getExpenseService;

    @Autowired
    private SaveExpenseService saveExpenseService;

    @Autowired
    private DeleteExpenseService deleteExpenseService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<ExpenseResponse>> getExpenses(
            @RequestParam(required = false) String initDate,
            @RequestParam(required = false) String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate initDateTime = LocalDate.parse(initDate, formatter);
        LocalDate endDateTime = LocalDate.parse(endDate, formatter);

        List<ExpenseResponse> expenses = getExpenseService.getExpensesForDate(initDateTime, endDateTime);

        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity<ExpenseResponse> saveExpense(@RequestBody ExpenseRequest expenseRequest) {

        ExpenseResponse expenseSaved = saveExpenseService.saveExpense(expenseRequest);

        return new ResponseEntity<>(expenseSaved, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{expenseId}")
    public void deleteExpense(@PathVariable Long expenseId) {
        deleteExpenseService.deleteExpense(expenseId);
    }
}
