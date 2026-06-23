package src;

import src.controllers.BillingController;
import src.services.BillingService;
import src.services.InvoiceService;

public class Main {

    public static void main(String[] args) {

        InvoiceService invoiceService = new InvoiceService();
        BillingService billingService = new BillingService(invoiceService);
        BillingController controller = new BillingController(billingService, invoiceService);

        controller.createInvoice("Alhanoof Consulting", "Enterprise", 1200);
        controller.createInvoice("Smart HR Platform", "Professional", 450);
        controller.createInvoice("Cloud Learning App", "Basic", 299);

        controller.payInvoice(1);

        controller.showInvoices();
        controller.showBillingSummary();
    }
}
