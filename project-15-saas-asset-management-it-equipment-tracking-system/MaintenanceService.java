package src.services;

import src.models.MaintenanceRecord;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceService {

    private List<MaintenanceRecord> records = new ArrayList<>();

    public void recordMaintenance(int assetId, String description) {
        records.add(new MaintenanceRecord(assetId, description));
    }

    public int totalMaintenanceRecords() {
        return records.size();
    }
}
