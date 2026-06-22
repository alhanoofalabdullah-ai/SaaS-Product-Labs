package src.services;

public class BillingService {

    public void generateInvoice(
            String customer,
            double amount) {

        System.out.println(
                "Invoice Generated for "
                        + customer +
                        " Amount: $" +
                        amount);
    }
}
