package src.services;

public class AnalyticsService {

    private ExpenseService expenseService;
    private BudgetService budgetService;

    public AnalyticsService(
            ExpenseService expenseService,
            BudgetService budgetService) {

        this.expenseService = expenseService;
        this.budgetService = budgetService;
    }

    public double budgetUtilization() {

        double budget =
                budgetService.totalBudgetAmount();

        if (budget == 0) {
            return 0;
        }

        return (expenseService.totalExpenseAmount()
                / budget) * 100;
    }
}
