package src.models;

public class PurchaseOrder {

    private int id;
    private String supplier;
    private double amount;

    public PurchaseOrder(
            int id,
            String supplier,
            double amount) {

        this.id = id;
        this.supplier = supplier;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
