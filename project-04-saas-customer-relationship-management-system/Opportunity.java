package src.models;

public class Opportunity {

    private String customer;
    private double value;

    public Opportunity(String customer,
                       double value) {

        this.customer = customer;
        this.value = value;
    }

    public String getCustomer() {
        return customer;
    }

    public double getValue() {
        return value;
    }
}
