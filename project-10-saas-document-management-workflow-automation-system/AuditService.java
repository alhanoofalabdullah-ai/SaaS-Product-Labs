package src.services;

import src.models.AuditLog;

import java.util.ArrayList;
import java.util.List;

public class AuditService {

    private List<AuditLog> logs =
            new ArrayList<>();

    public void logAction(
            String action) {

        logs.add(
                new AuditLog(action));
    }

    public int totalEvents() {

        return logs.size();
    }
}
