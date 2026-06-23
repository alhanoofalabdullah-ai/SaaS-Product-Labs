package src.services;

import src.models.Expense;
import java.util.*;

public class ExpenseService {

    private List<Expense> expenses =
            new ArrayList<>();

    public void addExpense(
            String department,
            String description,
            double amount) {

        expenses.add(
                new Expense(
                        department,
                        description,
                        amount));
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public int totalExpenses() {
        return expenses.size();
    }

    public double totalExpenseAmount() {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }
}
