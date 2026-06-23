package src.models;

public class Plan {

    private String name;
    private double price;

    public Plan(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {

        return price;
    }
}
