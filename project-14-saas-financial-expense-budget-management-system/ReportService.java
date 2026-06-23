package src.services;

public class ReportService {

    private ExpenseService expenseService;
    private BudgetService budgetService;
    private AnalyticsService analyticsService;

    public ReportService(
            ExpenseService expenseService,
            BudgetService budgetService,
            AnalyticsService analyticsService) {

        this.expenseService = expenseService;
        this.budgetService = budgetService;
        this.analyticsService = analyticsService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== FINANCE DASHBOARD =====");

        System.out.println(
                "Total Budgets: "
                        + budgetService.totalBudgets());

        System.out.println(
                "Total Expenses: "
                        + expenseService.totalExpenses());

        System.out.println(
                "Budget Utilization: "
                        + analyticsService.budgetUtilization()
                        + "%");

        System.out.println(
                "Total Spending: $"
                        + expenseService.totalExpenseAmount());
    }
}
