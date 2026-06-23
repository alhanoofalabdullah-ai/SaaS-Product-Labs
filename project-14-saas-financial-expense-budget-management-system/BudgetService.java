package src.services;

import src.models.Budget;
import java.util.*;

public class BudgetService {

    private List<Budget> budgets =
            new ArrayList<>();

    public void createBudget(
            String department,
            double amount) {

        budgets.add(
                new Budget(
                        department,
                        amount));
    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    public int totalBudgets() {
        return budgets.size();
    }

    public double totalBudgetAmount() {

        double total = 0;

        for (Budget budget : budgets) {
            total += budget.getAllocatedAmount();
        }

        return total;
    }
}
