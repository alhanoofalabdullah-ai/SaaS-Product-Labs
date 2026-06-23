package src.services;

import src.models.Document;

public class ApprovalService {

    private int approvedDocuments = 0;

    public void approve(
            Document document) {

        if (document != null) {

            document.approve();
            approvedDocuments++;
        }
    }

    public int totalApproved() {

        return approvedDocuments;
    }
}
