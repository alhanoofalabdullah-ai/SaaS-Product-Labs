package src.services;

public class RiskService {

    private int highRiskContracts = 0;

    public void assessRisk(
            String contract,
            String level) {

        if(level.equals("HIGH")) {
            highRiskContracts++;
        }
    }

    public int totalHighRiskContracts() {
        return highRiskContracts;
    }
}
