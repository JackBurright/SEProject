package com.example.expensetracker;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    private final List<Expense> expenses = new ArrayList<>();

    public List<Expense> getAllExpenses() {
        return new ArrayList<>(expenses);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void updateExpense(Expense updatedExpense) {
        expenses.removeIf(e -> e.getId().equals(updatedExpense.getId()));
        expenses.add(updatedExpense);
    }

    public void deleteExpense(Integer expenseId) {
        expenses.removeIf(e -> e.getId().equals(expenseId));
    }

    public Expense getExpenseById(Integer expenseId) {
        return expenses.stream().filter(e -> e.getId().equals(expenseId)).findFirst().orElse(null);
    }
}