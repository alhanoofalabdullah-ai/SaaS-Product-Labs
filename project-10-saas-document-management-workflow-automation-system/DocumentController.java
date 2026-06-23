package src.controllers;

import src.models.Document;
import src.services.*;

public class DocumentController {

    private DocumentService documentService;
    private WorkflowService workflowService;
    private ApprovalService approvalService;
    private AuditService auditService;
    private ReportService reportService;

    public DocumentController(
            DocumentService documentService,
            WorkflowService workflowService,
            ApprovalService approvalService,
            AuditService auditService,
            ReportService reportService) {

        this.documentService = documentService;
        this.workflowService = workflowService;
        this.approvalService = approvalService;
        this.auditService = auditService;
        this.reportService = reportService;
    }

    public void createDocument(
            String title,
            String owner) {

        documentService.createDocument(
                title,
                owner);

        auditService.logAction(
                "Document Created");
    }

    public void assignWorkflow(
            int documentId,
            String workflowName) {

        workflowService.assignWorkflow(
                documentId,
                workflowName);

        auditService.logAction(
                "Workflow Assigned");
    }

    public void approveDocument(
            int documentId) {

        Document document =
                documentService.findDocument(
                        documentId);

        approvalService.approve(
                document);

        auditService.logAction(
                "Document Approved");
    }

    public void showDashboard() {

        reportService.showDashboard();
    }
}
