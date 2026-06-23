package src.services;

import src.models.PurchaseOrder;
import src.models.PurchaseRequest;

import java.util.ArrayList;
import java.util.List;

public class ProcurementService {

    private List<PurchaseRequest> requests =
            new ArrayList<>();

    private List<PurchaseOrder> orders =
            new ArrayList<>();

    private int requestId = 1;
    private int orderId = 1;

    public void createRequest(
            String department,
            String item,
            double amount) {

        requests.add(
                new PurchaseRequest(
                        requestId++,
                        department,
                        item,
                        amount));
    }

    public PurchaseRequest findRequest(
            int id) {

        for (PurchaseRequest request : requests) {

            if (request.getId() == id) {
                return request;
            }
        }

        return null;
    }

    public void createPurchaseOrder(
            String supplier,
            double amount) {

        orders.add(
                new PurchaseOrder(
                        orderId++,
                        supplier,
                        amount));
    }

    public int totalRequests() {
        return requests.size();
    }

    public int totalOrders() {
        return orders.size();
    }

    public double totalSpend() {

        double total = 0;

        for (PurchaseOrder order : orders) {
            total += order.getAmount();
        }

        return total;
    }
}
