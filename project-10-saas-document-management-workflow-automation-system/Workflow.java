package src.models;

public class Workflow {

    private int documentId;
    private String workflowName;

    public Workflow(
            int documentId,
            String workflowName) {

        this.documentId = documentId;
        this.workflowName = workflowName;
    }

    public String getWorkflowName() {
        return workflowName;
    }
}
