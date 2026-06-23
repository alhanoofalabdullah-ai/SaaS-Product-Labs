package src.services;

public class ReportService {

    private EmployeeService employeeService;
    private LeaveService leaveService;
    private PayrollService payrollService;

    public ReportService(
            EmployeeService employeeService,
            LeaveService leaveService,
            PayrollService payrollService) {

        this.employeeService = employeeService;
        this.leaveService = leaveService;
        this.payrollService = payrollService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== HR DASHBOARD =====");

        System.out.println(
                "Employees: "
                        + employeeService.totalEmployees());

        System.out.println(
                "Pending Leave Requests: "
                        + leaveService.pendingRequests());

        System.out.println(
                "Monthly Payroll: $"
                        + employeeService.totalPayroll());
    }
}
