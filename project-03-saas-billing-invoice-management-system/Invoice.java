package src.models;

public class Invoice {

    private int invoiceId;
    private String customerName;
    private String planName;
    private double subtotal;
    private double vat;
    private double total;
    private String status;

    public Invoice(
            int invoiceId,
            String customerName,
            String planName,
            double subtotal,
            double vat,
            double total) {

        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.planName = planName;
        this.subtotal = subtotal;
        this.vat = vat;
        this.total = total;
        this.status = "UNPAID";
    }

    public int getInvoiceId() {

        return invoiceId;
    }

    public String getCustomerName() {

        return customerName;
    }

    public String getPlanName() {

        return planName;
    }

    public double getSubtotal() {

        return subtotal;
    }

    public double getVat() {

        return vat;
    }

    public double getTotal() {

        return total;
    }

    public String getStatus() {

        return status;
    }

    public void markAsPaid() {

        this.status = "PAID";
    }

    @Override
    public String toString() {

        return "INV-" + invoiceId
                + " | " + customerName
                + " | " + planName
                + " | Subtotal: " + subtotal
                + " | VAT: " + vat
                + " | Total: " + total
                + " | " + status;
    }
}
