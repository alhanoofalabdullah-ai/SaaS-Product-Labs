package src.services;

import src.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees =
            new ArrayList<>();

    private int nextId = 1;

    public void addEmployee(
            String name,
            String department,
            double salary) {

        employees.add(
                new Employee(
                        nextId++,
                        name,
                        department,
                        salary
                )
        );
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int totalEmployees() {
        return employees.size();
    }

    public double totalPayroll() {

        double total = 0;

        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        return total;
    }
}
