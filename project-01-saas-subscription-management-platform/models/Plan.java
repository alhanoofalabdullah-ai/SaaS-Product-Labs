package src.models;

public class Plan {

    private String name;
    private double monthlyPrice;

    public Plan(String name, double monthlyPrice) {
        this.name = name;
        this.monthlyPrice = monthlyPrice;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }
}
