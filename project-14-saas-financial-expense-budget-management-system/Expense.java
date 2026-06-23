package src.models;

public class Expense {

    private String department;
    private String description;
    private double amount;

    public Expense(
            String department,
            String description,
            double amount) {

        this.department = department;
        this.description = description;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
