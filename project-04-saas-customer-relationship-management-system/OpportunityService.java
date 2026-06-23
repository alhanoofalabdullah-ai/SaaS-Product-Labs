package src.services;

import src.models.Opportunity;
import java.util.ArrayList;
import java.util.List;

public class OpportunityService {

    private List<Opportunity> opportunities =
            new ArrayList<>();

    public void addOpportunity(Opportunity opportunity) {
        opportunities.add(opportunity);
    }

    public int totalOpportunities() {
        return opportunities.size();
    }

    public double totalValue() {

        double total = 0;

        for (Opportunity opportunity : opportunities) {
            total += opportunity.getValue();
        }

        return total;
    }
}
