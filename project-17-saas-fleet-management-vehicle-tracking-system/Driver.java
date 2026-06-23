package src.models;

public class Driver {

    private int id;
    private String name;
    private String status;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = "AVAILABLE";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void assign() {
        this.status = "ASSIGNED";
    }

    public void release() {
        this.status = "AVAILABLE";
    }
}
