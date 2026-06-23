package src.services;

import src.models.LeaveRequest;

import java.util.ArrayList;
import java.util.List;

public class LeaveService {

    private List<LeaveRequest> requests =
            new ArrayList<>();

    public void submitLeave(
            String employeeName,
            int days) {

        requests.add(
                new LeaveRequest(
                        employeeName,
                        days
                )
        );
    }

    public int pendingRequests() {

        int count = 0;

        for (LeaveRequest request : requests) {

            if (request.getStatus().equals("PENDING")) {
                count++;
            }
        }

        return count;
    }
}
