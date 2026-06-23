package src.models;

public class StockTransaction {

    private int productId;
    private String type;
    private int quantity;

    public StockTransaction(int productId, String type, int quantity) {
        this.productId = productId;
        this.type = type;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId
                + " | Type: " + type
                + " | Quantity: " + quantity;
    }
}
