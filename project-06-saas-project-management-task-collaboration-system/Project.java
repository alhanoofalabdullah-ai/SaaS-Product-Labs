package src.models;

public class Project {

    private int id;
    private String name;
    private String description;
    private String status;

    public Project(int id, String name, String description) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.status = "ACTIVE";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void closeProject() {
        this.status = "CLOSED";
    }

    @Override
    public String toString() {
        return "Project #" + id + " | " + name + " | " + status;
    }
}
