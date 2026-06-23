package src.models;

public class Customer {

    private int id;
    private String companyName;
    private String status;

    public Customer(int id,
                    String companyName,
                    String status) {

        this.id = id;
        this.companyName = companyName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getStatus() {
        return status;
    }
}
