package src.services;

public class ReportService {

    private DocumentService documentService;
    private WorkflowService workflowService;
    private ApprovalService approvalService;
    private AuditService auditService;

    public ReportService(
            DocumentService documentService,
            WorkflowService workflowService,
            ApprovalService approvalService,
            AuditService auditService) {

        this.documentService = documentService;
        this.workflowService = workflowService;
        this.approvalService = approvalService;
        this.auditService = auditService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== DOCUMENT CONTROL DASHBOARD =====");

        System.out.println(
                "Documents: "
                        + documentService.totalDocuments());

        System.out.println(
                "Active Workflows: "
                        + workflowService.totalWorkflows());

        System.out.println(
                "Approved Documents: "
                        + approvalService.totalApproved());

        System.out.println(
                "Audit Events: "
                        + auditService.totalEvents());
    }
}
