package src;

import src.controllers.TicketController;
import src.services.TicketService;

public class Main {

    public static void main(String[] args) {

        TicketService service = new TicketService();

        TicketController controller =
                new TicketController(service);

        controller.createTicket(
                "Login Issue",
                "Unable to access account",
                "HIGH"
        );

        controller.createTicket(
                "Billing Question",
                "Invoice clarification",
                "MEDIUM"
        );

        controller.assignTicket(1, "Ahmed");

        controller.resolveTicket(1);

        controller.showDashboard();
    }
}
