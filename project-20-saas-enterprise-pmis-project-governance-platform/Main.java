package src;

import src.controllers.PMISController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        ProjectService projectService = new ProjectService();
        RiskService riskService = new RiskService();
        WorkflowService workflowService = new WorkflowService();
        DocumentationService documentationService =
                new DocumentationService();

        ReportService reportService =
                new ReportService(
                        projectService,
                        riskService,
                        workflowService,
                        documentationService
                );

        PMISController controller =
                new PMISController(
                        projectService,
                        riskService,
                        workflowService,
                        documentationService,
                        reportService
                );

        controller.createProject(
                "Laheq Island Development");

        controller.registerDocument(
                "Technical Submittal");

        controller.createWorkflow(
                "Engineering Review");

        controller.registerRisk(
                "Delayed Approval",
                "HIGH");

        controller.showDashboard();
    }
}
