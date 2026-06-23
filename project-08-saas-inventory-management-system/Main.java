# Main.java

```java
package src;

import src.controllers.InventoryController;
import src.services.InventoryService;
import src.services.ProductService;
import src.services.ReportService;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductService();
        InventoryService inventoryService = new InventoryService(productService);
        ReportService reportService = new ReportService(productService);

        InventoryController controller =
                new InventoryController(productService, inventoryService, reportService);

        controller.addProduct("Laptop", "Electronics", 25, 3500);
        controller.addProduct("Office Chair", "Furniture", 120, 450);
        controller.addProduct("Router", "Networking", 8, 1200);

        controller.addStock(1, 15);
        controller.removeStock(2, 30);

        controller.showProducts();
        controller.showDashboard();
    }
}
