package src;

import src.controllers.HRController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        LeaveService leaveService = new LeaveService();
        PayrollService payrollService = new PayrollService();
        ReportService reportService = new ReportService(
                employeeService,
                leaveService,
                payrollService
        );

        HRController hr = new HRController(
                employeeService,
                leaveService,
                payrollService,
                reportService
        );

        hr.addEmployee("Alhanoof", "IT", 18000);
        hr.addEmployee("Ahmed", "Operations", 12000);
        hr.addEmployee("Sara", "HR", 14000);

        hr.submitLeave("Ahmed", 5);

        hr.showDashboard();
    }
}
