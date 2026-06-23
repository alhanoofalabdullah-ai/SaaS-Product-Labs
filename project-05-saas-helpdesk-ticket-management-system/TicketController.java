package src.controllers;

import src.models.Ticket;
import src.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(
            TicketService ticketService) {

        this.ticketService = ticketService;
    }

    public void createTicket(
            String title,
            String description,
            String priority) {

        ticketService.createTicket(
                title,
                description,
                priority
        );
    }

    public void assignTicket(
            int id,
            String agent) {

        Ticket ticket =
                ticketService.findTicket(id);

        if (ticket != null) {

            ticket.assignAgent(agent);
        }
    }

    public void resolveTicket(int id) {

        Ticket ticket =
                ticketService.findTicket(id);

        if (ticket != null) {

            ticket.resolve();
        }
    }

    public void showDashboard() {

        int open = 0;
        int resolved = 0;

        for (Ticket ticket :
                ticketService.getTickets()) {

            if (ticket.getStatus()
                    .equals("RESOLVED")) {

                resolved++;

            } else {

                open++;
            }
        }

        System.out.println(
                "\n===== HELP DESK DASHBOARD =====");

        System.out.println(
                "Open Tickets: " + open);

        System.out.println(
                "Resolved Tickets: " + resolved);
    }
}
