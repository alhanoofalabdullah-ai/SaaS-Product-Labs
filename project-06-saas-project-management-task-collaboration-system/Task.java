package src.models;

public class Task {

    private int id;
    private int projectId;
    private String title;
    private String assignedTo;
    private String priority;
    private String status;

    public Task(int id, int projectId, String title, String assignedTo, String priority) {

        this.id = id;
        this.projectId = projectId;
        this.title = title;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.status = "NEW";
    }

    public int getId() {
        return id;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getStatus() {
        return status;
    }

    public void startTask() {
        this.status = "IN_PROGRESS";
    }

    public void completeTask() {
        this.status = "COMPLETED";
    }

    @Override
    public String toString() {
        return "Task #" + id
                + " | Project: " + projectId
                + " | " + title
                + " | Assigned To: " + assignedTo
                + " | Priority: " + priority
                + " | Status: " + status;
    }
}
