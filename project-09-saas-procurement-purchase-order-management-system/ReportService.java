package src.services;

public class ReportService {

    private SupplierService supplierService;
    private ProcurementService procurementService;
    private ApprovalService approvalService;

    public ReportService(
            SupplierService supplierService,
            ProcurementService procurementService,
            ApprovalService approvalService) {

        this.supplierService = supplierService;
        this.procurementService = procurementService;
        this.approvalService = approvalService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== PROCUREMENT DASHBOARD =====");

        System.out.println(
                "Suppliers: "
                        + supplierService.totalSuppliers());

        System.out.println(
                "Purchase Requests: "
                        + procurementService.totalRequests());

        System.out.println(
                "Approved Requests: "
                        + approvalService.totalApproved());

        System.out.println(
                "Purchase Orders: "
                        + procurementService.totalOrders());

        System.out.println(
                "Procurement Spend: $"
                        + procurementService.totalSpend());
    }
}
