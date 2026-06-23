package src.models;

public class PurchaseRequest {

    private int id;
    private String department;
    private String item;
    private double amount;
    private String status;

    public PurchaseRequest(
            int id,
            String department,
            String item,
            double amount) {

        this.id = id;
        this.department = department;
        this.item = item;
        this.amount = amount;
        this.status = "PENDING";
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void approve() {
        status = "APPROVED";
    }
}
