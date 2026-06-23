package src.services;

public class ComplianceService {

    private int complianceRecords = 0;

    public void addRecord(String contract) {
        complianceRecords++;
    }

    public int totalComplianceRecords() {
        return complianceRecords;
    }
}
