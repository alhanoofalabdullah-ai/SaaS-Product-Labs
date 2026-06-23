package src;

import src.controllers.CRMController;
import src.services.CustomerService;
import src.services.LeadService;
import src.services.OpportunityService;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        LeadService leadService = new LeadService();
        OpportunityService opportunityService = new OpportunityService();

        CRMController crm = new CRMController(
                customerService,
                leadService,
                opportunityService
        );

        crm.addLead("Saudi Aramco", "Website");
        crm.addLead("NEOM", "LinkedIn");
        crm.addLead("PIF Project", "Referral");

        crm.createOpportunity("Saudi Aramco", 250000);
        crm.createOpportunity("NEOM", 450000);

        crm.showDashboard();
    }
}
