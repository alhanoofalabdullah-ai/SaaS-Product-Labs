package src.models;

public class Subscription {

    private String customerName;
    private String planName;
    private double monthlyFee;

    public Subscription(String customerName,
                        String planName,
                        double monthlyFee) {

        this.customerName = customerName;
        this.planName = planName;
        this.monthlyFee = monthlyFee;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPlanName() {
        return planName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    @Override
    public String toString() {
        return customerName +
                " | " +
                planName +
                " | $" +
                monthlyFee;
    }
}
