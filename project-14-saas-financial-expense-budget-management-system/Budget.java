package src.models;

public class Budget {

    private String department;
    private double allocatedAmount;

    public Budget(
            String department,
            double allocatedAmount) {

        this.department = department;
        this.allocatedAmount = allocatedAmount;
    }

    public double getAllocatedAmount() {
        return allocatedAmount;
    }
}
