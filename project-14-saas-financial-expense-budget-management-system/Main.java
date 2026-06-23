package src;

import src.controllers.FinanceController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        ExpenseService expenseService = new ExpenseService();
        BudgetService budgetService = new BudgetService();
        AnalyticsService analyticsService =
                new AnalyticsService(expenseService, budgetService);

        ReportService reportService =
                new ReportService(
                        expenseService,
                        budgetService,
                        analyticsService);

        FinanceController controller =
                new FinanceController(
                        expenseService,
                        budgetService,
                        reportService);

        controller.createBudget(
                "IT Department",
                500000);

        controller.createBudget(
                "Operations",
                300000);

        controller.addExpense(
                "IT Department",
                "Software Licenses",
                45000);

        controller.addExpense(
                "Operations",
                "Office Supplies",
                15000);

        controller.showDashboard();
    }
}
