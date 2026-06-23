package src.models;

public class MaintenanceRecord {

    private int assetId;
    private String description;

    public MaintenanceRecord(int assetId, String description) {
        this.assetId = assetId;
        this.description = description;
    }

    public int getAssetId() {
        return assetId;
    }

    public String getDescription() {
        return description;
    }
}
