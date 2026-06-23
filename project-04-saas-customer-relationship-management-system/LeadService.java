package src.services;

import src.models.Lead;
import java.util.ArrayList;
import java.util.List;

public class LeadService {

    private List<Lead> leads =
            new ArrayList<>();

    public void addLead(Lead lead) {
        leads.add(lead);
    }

    public int totalLeads() {
        return leads.size();
    }
}
