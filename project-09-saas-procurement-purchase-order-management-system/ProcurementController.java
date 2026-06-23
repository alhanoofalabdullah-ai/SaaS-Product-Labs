package src.controllers;

import src.models.PurchaseRequest;
import src.services.*;

public class ProcurementController {

    private SupplierService supplierService;
    private ProcurementService procurementService;
    private ApprovalService approvalService;
    private ReportService reportService;

    public ProcurementController(
            SupplierService supplierService,
            ProcurementService procurementService,
            ApprovalService approvalService,
            ReportService reportService) {

        this.supplierService = supplierService;
        this.procurementService = procurementService;
        this.approvalService = approvalService;
        this.reportService = reportService;
    }

    public void addSupplier(
            String name,
            String email) {

        supplierService.addSupplier(
                name,
                email);
    }

    public void createPurchaseRequest(
            String department,
            String item,
            double amount) {

        procurementService.createRequest(
                department,
                item,
                amount);
    }

    public void approveRequest(
            int requestId) {

        PurchaseRequest request =
                procurementService.findRequest(
                        requestId);

        approvalService.approve(
                request);
    }

    public void generatePurchaseOrder(
            String supplier,
            double amount) {

        procurementService.createPurchaseOrder(
                supplier,
                amount);
    }

    public void showDashboard() {

        reportService.showDashboard();
    }
}
