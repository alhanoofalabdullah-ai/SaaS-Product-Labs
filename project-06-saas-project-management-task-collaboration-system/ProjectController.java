package src.controllers;

import src.services.ProjectService;
import src.services.ReportService;
import src.services.TaskService;

public class ProjectController {

    private ProjectService projectService;
    private TaskService taskService;
    private ReportService reportService;

    public ProjectController(
            ProjectService projectService,
            TaskService taskService,
            ReportService reportService) {

        this.projectService = projectService;
        this.taskService = taskService;
        this.reportService = reportService;
    }

    public void createProject(String name, String description) {
        projectService.createProject(name, description);
    }

    public void createTask(int projectId, String title, String assignedTo, String priority) {
        taskService.createTask(projectId, title, assignedTo, priority);
    }

    public void completeTask(int taskId) {
        taskService.completeTask(taskId);
    }

    public void showDashboard() {
        reportService.showProjectDashboard();
    }
}
