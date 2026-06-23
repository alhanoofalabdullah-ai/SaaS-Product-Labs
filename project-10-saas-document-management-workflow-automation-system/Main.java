package src;

import src.controllers.DocumentController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        DocumentService documentService = new DocumentService();
        WorkflowService workflowService = new WorkflowService();
        ApprovalService approvalService = new ApprovalService();
        AuditService auditService = new AuditService();

        ReportService reportService =
                new ReportService(
                        documentService,
                        workflowService,
                        approvalService,
                        auditService);

        DocumentController controller =
                new DocumentController(
                        documentService,
                        workflowService,
                        approvalService,
                        auditService,
                        reportService);

        controller.createDocument(
                "Technical Submittal",
                "Alhanoof");

        controller.assignWorkflow(
                1,
                "Engineering Review Workflow");

        controller.approveDocument(1);

        controller.showDashboard();
    }
}
