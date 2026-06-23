package src.controllers;

import src.services.*;

public class HRController {

    private EmployeeService employeeService;
    private LeaveService leaveService;
    private PayrollService payrollService;
    private ReportService reportService;

    public HRController(
            EmployeeService employeeService,
            LeaveService leaveService,
            PayrollService payrollService,
            ReportService reportService) {

        this.employeeService = employeeService;
        this.leaveService = leaveService;
        this.payrollService = payrollService;
        this.reportService = reportService;
    }

    public void addEmployee(
            String name,
            String department,
            double salary) {

        employeeService.addEmployee(
                name,
                department,
                salary
        );
    }

    public void submitLeave(
            String employee,
            int days) {

        leaveService.submitLeave(
                employee,
                days
        );
    }

    public void showDashboard() {

        reportService.showDashboard();
    }
}
