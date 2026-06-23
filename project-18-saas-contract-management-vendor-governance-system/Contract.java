package src.models;

public class Contract {

    private int id;
    private String contractName;
    private String vendor;
    private double value;

    public Contract(
            int id,
            String contractName,
            String vendor,
            double value) {

        this.id = id;
        this.contractName = contractName;
        this.vendor = vendor;
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
