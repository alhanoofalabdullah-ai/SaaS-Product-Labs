package src.models;

public class Payroll {

    private String employeeName;
    private double salary;

    public Payroll(String employeeName,
                   double salary) {

        this.employeeName = employeeName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
