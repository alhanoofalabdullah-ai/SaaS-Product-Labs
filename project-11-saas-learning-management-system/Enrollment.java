package src.models;

public class Enrollment {

    private String student;
    private String course;
    private boolean completed;

    public Enrollment(String student,
                      String course) {

        this.student = student;
        this.course = course;
        this.completed = false;
    }

    public void complete() {
        completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }
}
