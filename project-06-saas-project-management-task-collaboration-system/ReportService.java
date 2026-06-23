package src.services;

public class ReportService {

    private ProjectService projectService;
    private TaskService taskService;

    public ReportService(ProjectService projectService, TaskService taskService) {

        this.projectService = projectService;
        this.taskService = taskService;
    }

    public void showProjectDashboard() {

        int totalTasks = taskService.totalTasks();
        int completedTasks = taskService.completedTasks();

        double completionRate = 0;

        if (totalTasks > 0) {
            completionRate = (completedTasks * 100.0) / totalTasks;
        }

        System.out.println("\n===== PROJECT DASHBOARD =====");
        System.out.println("Projects: " + projectService.totalProjects());
        System.out.println("Tasks: " + totalTasks);
        System.out.println("Completed Tasks: " + completedTasks);
        System.out.println("Open Tasks: " + taskService.openTasks());
        System.out.println("Completion Rate: " + completionRate + "%");
    }
}
