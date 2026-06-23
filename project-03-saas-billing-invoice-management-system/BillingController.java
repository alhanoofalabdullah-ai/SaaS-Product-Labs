package src.controllers;

import src.models.Invoice;
import src.services.BillingService;
import src.services.InvoiceService;

public class BillingController {

    private BillingService billingService;
    private InvoiceService invoiceService;

    public BillingController(
            BillingService billingService,
            InvoiceService invoiceService) {

        this.billingService = billingService;
        this.invoiceService = invoiceService;
    }

    public void createInvoice(String customerName, String planName, double subtotal) {

        Invoice invoice = billingService.createInvoice(customerName, planName, subtotal);

        System.out.println("Invoice created: " + invoice);
    }

    public void payInvoice(int invoiceId) {

        billingService.payInvoice(invoiceId);
    }

    public void showInvoices() {

        System.out.println("\n===== INVOICES =====");

        for (Invoice invoice : invoiceService.getAllInvoices()) {

            System.out.println(invoice);
        }
    }

    public void showBillingSummary() {

        System.out.println("\n===== BILLING SUMMARY =====");

        System.out.println("Total Invoices: " + invoiceService.getAllInvoices().size());
        System.out.println("Paid Invoices: " + invoiceService.countPaidInvoices());
        System.out.println("Unpaid Invoices: " + invoiceService.countUnpaidInvoices());
        System.out.println("Total Revenue: " + invoiceService.calculateTotalRevenue());
    }
}
