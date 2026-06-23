package src.models;

public class Assignment {

    private int assetId;
    private String employeeName;

    public Assignment(int assetId, String employeeName) {
        this.assetId = assetId;
        this.employeeName = employeeName;
    }

    public int getAssetId() {
        return assetId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
