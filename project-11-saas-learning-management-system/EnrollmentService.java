package src.services;

import src.models.Enrollment;
import java.util.*;

public class EnrollmentService {

    private List<Enrollment> enrollments =
            new ArrayList<>();

    public void enroll(
            String student,
            String course) {

        enrollments.add(
                new Enrollment(
                        student,
                        course));
    }

    public void completeCourse(
            String student,
            String course) {

        for (Enrollment e : enrollments) {

            e.complete();
        }
    }

    public int totalEnrollments() {
        return enrollments.size();
    }

    public int completedCourses() {

        int count = 0;

        for (Enrollment e : enrollments) {

            if (e.isCompleted()) {
                count++;
            }
        }

        return count;
    }
}
