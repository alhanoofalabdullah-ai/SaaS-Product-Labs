package src.services;

import src.models.Asset;
import src.models.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentService {

    private AssetService assetService;
    private List<Assignment> assignments = new ArrayList<>();

    public AssignmentService(AssetService assetService) {
        this.assetService = assetService;
    }

    public void assignAsset(int assetId, String employeeName) {
        Asset asset = assetService.findAsset(assetId);

        if (asset != null && asset.getStatus().equals("AVAILABLE")) {
            asset.assign();
            assignments.add(new Assignment(assetId, employeeName));
        }
    }

    public int totalAssignments() {
        return assignments.size();
    }
}
