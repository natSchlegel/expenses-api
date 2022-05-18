package com.codandosimples.expensesapi.api;

import com.codandosimples.expensesapi.domain.Expense;
import com.codandosimples.expensesapi.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class ExpensesController {

    private ExpenseRepository expenseRepository;

    public ExpensesController(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    @GetMapping("/expenses")
    public List<Expense> findAll(){
        return StreamSupport.stream(expenseRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }
}
