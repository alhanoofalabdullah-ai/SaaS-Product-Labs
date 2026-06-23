package src;

import src.controllers.ProcurementController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        SupplierService supplierService = new SupplierService();
        ProcurementService procurementService = new ProcurementService();
        ApprovalService approvalService = new ApprovalService();

        ReportService reportService =
                new ReportService(
                        supplierService,
                        procurementService,
                        approvalService);

        ProcurementController controller =
                new ProcurementController(
                        supplierService,
                        procurementService,
                        approvalService,
                        reportService);

        controller.addSupplier(
                "Cisco",
                "networking@cisco.com");

        controller.addSupplier(
                "Microsoft",
                "enterprise@microsoft.com");

        controller.createPurchaseRequest(
                "IT Department",
                "Network Switches",
                45000);

        controller.approveRequest(1);

        controller.generatePurchaseOrder(
                "Cisco",
                45000);

        controller.showDashboard();
    }
}
