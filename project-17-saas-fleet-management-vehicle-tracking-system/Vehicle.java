package src.models;

public class Vehicle {

    private int id;
    private String model;
    private String plateNumber;
    private double mileage;
    private String status;

    public Vehicle(int id, String model, String plateNumber, double mileage) {
        this.id = id;
        this.model = model;
        this.plateNumber = plateNumber;
        this.mileage = mileage;
        this.status = "AVAILABLE";
    }

    public int getId() {
        return id;
    }

    public double getMileage() {
        return mileage;
    }

    public String getStatus() {
        return status;
    }

    public void assignToTrip() {
        this.status = "ON_TRIP";
    }

    public void markAvailable() {
        this.status = "AVAILABLE";
    }

    public void markMaintenance() {
        this.status = "MAINTENANCE";
    }

    public void addMileage(double distance) {
        this.mileage += distance;
    }

    @Override
    public String toString() {
        return "Vehicle #" + id
                + " | " + model
                + " | Plate: " + plateNumber
                + " | Mileage: " + mileage
                + " KM | Status: " + status;
    }
}
