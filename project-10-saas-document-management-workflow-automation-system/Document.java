package src.models;

public class Document {

    private int id;
    private String title;
    private String owner;
    private String status;
    private int revision;

    public Document(
            int id,
            String title,
            String owner) {

        this.id = id;
        this.title = title;
        this.owner = owner;
        this.status = "DRAFT";
        this.revision = 1;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void approve() {
        status = "APPROVED";
    }

    public void reject() {
        status = "REJECTED";
    }
}
