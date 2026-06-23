package src.services;

import src.models.Invoice;

public class BillingService {

    private InvoiceService invoiceService;
    private int nextInvoiceId = 1;
    private final double VAT_RATE = 0.15;

    public BillingService(InvoiceService invoiceService) {

        this.invoiceService = invoiceService;
    }

    public Invoice createInvoice(String customerName, String planName, double subtotal) {

        double vat = subtotal * VAT_RATE;
        double total = subtotal + vat;

        Invoice invoice = new Invoice(
                nextInvoiceId,
                customerName,
                planName,
                subtotal,
                vat,
                total
        );

        invoiceService.addInvoice(invoice);
        nextInvoiceId++;

        return invoice;
    }

    public void payInvoice(int invoiceId) {

        Invoice invoice = invoiceService.findInvoiceById(invoiceId);

        if (invoice != null) {

            invoice.markAsPaid();

            System.out.println("Invoice paid successfully: INV-" + invoiceId);

        } else {

            System.out.println("Invoice not found: INV-" + invoiceId);
        }
    }
}
