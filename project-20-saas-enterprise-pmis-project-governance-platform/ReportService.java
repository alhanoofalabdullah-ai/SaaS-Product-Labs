package src.services;

public class ReportService {

    private ProjectService projectService;
    private RiskService riskService;
    private WorkflowService workflowService;
    private DocumentationService documentationService;

    public ReportService(
            ProjectService projectService,
            RiskService riskService,
            WorkflowService workflowService,
            DocumentationService documentationService) {

        this.projectService = projectService;
        this.riskService = riskService;
        this.workflowService = workflowService;
        this.documentationService = documentationService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== EXECUTIVE PMIS DASHBOARD =====");

        System.out.println(
                "Projects: "
                        + projectService.totalProjects());

        System.out.println(
                "Documents: "
                        + documentationService.totalDocuments());

        System.out.println(
                "Workflows: "
                        + workflowService.totalWorkflows());

        System.out.println(
                "Risks: "
                        + riskService.totalRisks());

        System.out.println(
                "High Risks: "
                        + riskService.highRisks());
    }
}
