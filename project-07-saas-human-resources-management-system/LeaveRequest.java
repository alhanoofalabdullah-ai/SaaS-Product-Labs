package src.models;

public class LeaveRequest {

    private String employeeName;
    private int days;
    private String status;

    public LeaveRequest(String employeeName,
                        int days) {

        this.employeeName = employeeName;
        this.days = days;
        this.status = "PENDING";
    }

    public String getStatus() {
        return status;
    }

    public int getDays() {
        return days;
    }
}
