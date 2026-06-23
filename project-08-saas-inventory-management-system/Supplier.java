package src.models;

public class Supplier {

    private int id;
    private String name;
    private String contactEmail;

    public Supplier(int id, String name, String contactEmail) {
        this.id = id;
        this.name = name;
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
