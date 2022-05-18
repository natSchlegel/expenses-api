package com.codandosimples.expensesapi.repository;

import com.codandosimples.expensesapi.domain.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense,Long> {
}
