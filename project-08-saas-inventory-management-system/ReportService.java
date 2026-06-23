package src.services;

import src.models.Product;

public class ReportService {

    private ProductService productService;

    public ReportService(ProductService productService) {
        this.productService = productService;
    }

    public void showDashboard() {

        int totalStock = 0;
        int lowStock = 0;
        double inventoryValue = 0;

        for (Product product : productService.getProducts()) {
            totalStock += product.getQuantity();
            inventoryValue += product.getStockValue();

            if (product.isLowStock()) {
                lowStock++;
            }
        }

        System.out.println("\n===== INVENTORY DASHBOARD =====");
        System.out.println("Products: " + productService.totalProducts());
        System.out.println("Total Stock Units: " + totalStock);
        System.out.println("Low Stock Products: " + lowStock);
        System.out.println("Inventory Value: " + inventoryValue);
    }
}
