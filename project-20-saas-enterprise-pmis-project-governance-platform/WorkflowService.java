package src.services;

import src.models.Workflow;
import java.util.*;

public class WorkflowService {

    private List<Workflow> workflows =
            new ArrayList<>();

    public void createWorkflow(
            String name) {

        workflows.add(
                new Workflow(name));
    }

    public int totalWorkflows() {
        return workflows.size();
    }
}
