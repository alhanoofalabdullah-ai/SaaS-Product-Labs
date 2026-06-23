package src.services;

import src.models.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customers =
            new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int totalCustomers() {
        return customers.size();
    }
}
