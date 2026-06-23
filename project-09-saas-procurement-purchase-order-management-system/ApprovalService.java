package src.services;

import src.models.PurchaseRequest;

public class ApprovalService {

    private int approvedRequests = 0;

    public void approve(
            PurchaseRequest request) {

        if (request != null) {

            request.approve();
            approvedRequests++;
        }
    }

    public int totalApproved() {
        return approvedRequests;
    }
}
