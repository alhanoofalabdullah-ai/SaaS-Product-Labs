package src.models;

public class Risk {

    private String description;
    private String severity;

    public Risk(
            String description,
            String severity) {

        this.description = description;
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }
}
