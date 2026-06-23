package src;

import src.controllers.LMSController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();
        CertificateService certificateService = new CertificateService();

        ReportService reportService =
                new ReportService(
                        studentService,
                        courseService,
                        enrollmentService,
                        certificateService);

        LMSController controller =
                new LMSController(
                        studentService,
                        courseService,
                        enrollmentService,
                        certificateService,
                        reportService);

        controller.addStudent("Alhanoof");
        controller.addStudent("Ahmed");

        controller.createCourse("Java Fundamentals");
        controller.createCourse("Cloud Computing");

        controller.enrollStudent("Alhanoof", "Java Fundamentals");
        controller.completeCourse("Alhanoof", "Java Fundamentals");

        controller.showDashboard();
    }
}
