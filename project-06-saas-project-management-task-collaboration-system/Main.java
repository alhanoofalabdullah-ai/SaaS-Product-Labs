package src;

import src.controllers.ProjectController;
import src.services.ProjectService;
import src.services.ReportService;
import src.services.TaskService;

public class Main {

    public static void main(String[] args) {

        ProjectService projectService = new ProjectService();
        TaskService taskService = new TaskService();
        ReportService reportService = new ReportService(projectService, taskService);

        ProjectController controller =
                new ProjectController(projectService, taskService, reportService);

        controller.createProject("Enterprise SaaS Platform", "Client delivery project");
        controller.createProject("Internal Automation Program", "Internal operations project");

        controller.createTask(1, "Design database schema", "Alhanoof", "HIGH");
        controller.createTask(1, "Build subscription module", "Sara", "MEDIUM");
        controller.createTask(2, "Automate monthly report", "Ahmed", "HIGH");
        controller.createTask(2, "Prepare documentation", "Noura", "LOW");

        controller.completeTask(1);

        controller.showDashboard();
    }
}
