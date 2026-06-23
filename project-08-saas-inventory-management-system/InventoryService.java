package src.services;

import src.models.Product;
import src.models.StockTransaction;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private ProductService productService;
    private List<StockTransaction> transactions = new ArrayList<>();

    public InventoryService(ProductService productService) {
        this.productService = productService;
    }

    public void addStock(int productId, int quantity) {
        Product product = productService.findProduct(productId);

        if (product != null) {
            product.addQuantity(quantity);
            transactions.add(new StockTransaction(productId, "STOCK_IN", quantity));
        }
    }

    public void removeStock(int productId, int quantity) {
        Product product = productService.findProduct(productId);

        if (product != null) {
            product.removeQuantity(quantity);
            transactions.add(new StockTransaction(productId, "STOCK_OUT", quantity));
        }
    }

    public List<StockTransaction> getTransactions() {
        return transactions;
    }
}
