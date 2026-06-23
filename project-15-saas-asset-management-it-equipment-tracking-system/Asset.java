package src.models;

public class Asset {

    private int id;
    private String category;
    private String name;
    private String serialNumber;
    private String status;

    public Asset(int id, String category, String name, String serialNumber) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.serialNumber = serialNumber;
        this.status = "AVAILABLE";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void assign() {
        this.status = "ASSIGNED";
    }

    public void maintenance() {
        this.status = "MAINTENANCE";
    }

    public void release() {
        this.status = "AVAILABLE";
    }

    @Override
    public String toString() {
        return "Asset #" + id
                + " | " + category
                + " | " + name
                + " | Serial: " + serialNumber
                + " | Status: " + status;
    }
}
