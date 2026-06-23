package src.services;

import src.models.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService {

    private List<Invoice> invoices = new ArrayList<>();

    public void addInvoice(Invoice invoice) {

        invoices.add(invoice);
    }

    public List<Invoice> getAllInvoices() {

        return invoices;
    }

    public Invoice findInvoiceById(int id) {

        for (Invoice invoice : invoices) {

            if (invoice.getInvoiceId() == id) {

                return invoice;
            }
        }

        return null;
    }

    public int countPaidInvoices() {

        int count = 0;

        for (Invoice invoice : invoices) {

            if (invoice.getStatus().equals("PAID")) {

                count++;
            }
        }

        return count;
    }

    public int countUnpaidInvoices() {

        int count = 0;

        for (Invoice invoice : invoices) {

            if (invoice.getStatus().equals("UNPAID")) {

                count++;
            }
        }

        return count;
    }

    public double calculateTotalRevenue() {

        double total = 0;

        for (Invoice invoice : invoices) {

            total += invoice.getTotal();
        }

        return total;
    }
}
