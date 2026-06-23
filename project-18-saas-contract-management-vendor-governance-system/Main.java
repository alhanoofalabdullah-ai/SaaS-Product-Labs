package src;

import src.controllers.ContractController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        VendorService vendorService = new VendorService();
        ContractService contractService = new ContractService();
        ComplianceService complianceService = new ComplianceService();
        RiskService riskService = new RiskService();

        ReportService reportService =
                new ReportService(
                        vendorService,
                        contractService,
                        complianceService,
                        riskService);

        ContractController controller =
                new ContractController(
                        vendorService,
                        contractService,
                        complianceService,
                        riskService,
                        reportService);

        controller.addVendor("Oracle");
        controller.addVendor("Cisco");

        controller.createContract(
                "Cloud Infrastructure Contract",
                "Oracle",
                1200000);

        controller.createContract(
                "Network Equipment Agreement",
                "Cisco",
                850000);

        controller.addComplianceRecord(
                "Cloud Infrastructure Contract");

        controller.assessRisk(
                "Network Equipment Agreement",
                "MEDIUM");

        controller.showDashboard();
    }
}
