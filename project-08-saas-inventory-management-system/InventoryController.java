package src.controllers;

import src.models.Product;
import src.services.InventoryService;
import src.services.ProductService;
import src.services.ReportService;

public class InventoryController {

    private ProductService productService;
    private InventoryService inventoryService;
    private ReportService reportService;

    public InventoryController(
            ProductService productService,
            InventoryService inventoryService,
            ReportService reportService) {

        this.productService = productService;
        this.inventoryService = inventoryService;
        this.reportService = reportService;
    }

    public void addProduct(String name, String category, int quantity, double price) {
        productService.addProduct(name, category, quantity, price);
    }

    public void addStock(int productId, int quantity) {
        inventoryService.addStock(productId, quantity);
    }

    public void removeStock(int productId, int quantity) {
        inventoryService.removeStock(productId, quantity);
    }

    public void showProducts() {
        System.out.println("\n===== PRODUCTS =====");

        for (Product product : productService.getProducts()) {
            System.out.println(product);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
