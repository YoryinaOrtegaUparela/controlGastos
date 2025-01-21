package com.presupuesto.casa.infrastructure.controllers;

import com.presupuesto.casa.application.usecases.ports.input.expense.GetExpenseService;
import com.presupuesto.casa.domain.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private GetExpenseService getExpenseService;


    @GetMapping(path = "/{id}", produces = "application/json")
    public String getExpenses(
            @PathVariable Long id,
            @RequestParam(required = false) String initDate,
            @RequestParam(required = false) String endDate) {

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDateTime dateTime = LocalDateTime.parse(initDate, formatter);
//        LocalDateTime endDateTime = LocalDateTime.parse(endDate, formatter);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime = LocalDate.parse(initDate, formatter);
        LocalDate endDateTime = LocalDate.parse(endDate, formatter);

        List<Expense> expenses = getExpenseService.getExpenses(id, dateTime.atStartOfDay(), endDateTime.atStartOfDay());

        return expenses.toString();
    }
}
