package src.controllers;

import src.models.Lead;
import src.models.Opportunity;
import src.services.CustomerService;
import src.services.LeadService;
import src.services.OpportunityService;

public class CRMController {

    private CustomerService customerService;
    private LeadService leadService;
    private OpportunityService opportunityService;

    public CRMController(
            CustomerService customerService,
            LeadService leadService,
            OpportunityService opportunityService) {

        this.customerService = customerService;
        this.leadService = leadService;
        this.opportunityService = opportunityService;
    }

    public void addLead(String company,
                        String source) {

        leadService.addLead(
                new Lead(company, source)
        );
    }

    public void createOpportunity(
            String customer,
            double value) {

        opportunityService.addOpportunity(
                new Opportunity(customer, value)
        );
    }

    public void showDashboard() {

        System.out.println(
                "\n===== CRM DASHBOARD =====");

        System.out.println(
                "Leads: "
                        + leadService.totalLeads());

        System.out.println(
                "Opportunities: "
                        + opportunityService.totalOpportunities());

        System.out.println(
                "Pipeline Value: $"
                        + opportunityService.totalValue());
    }
}
