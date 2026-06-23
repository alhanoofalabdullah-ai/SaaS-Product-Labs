package src.models;

public class Supplier {

    private int id;
    private String name;
    private String email;

    public Supplier(
            int id,
            String name,
            String email) {

        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
