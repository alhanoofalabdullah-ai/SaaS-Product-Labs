package src.services;

import src.models.Subscription;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionService {

    private List<Subscription> subscriptions =
            new ArrayList<>();

    public void addSubscription(String customer,
                                String plan,
                                double fee) {

        subscriptions.add(
                new Subscription(customer,
                        plan,
                        fee)
        );
    }

    public void displaySubscriptions() {

        System.out.println(
                "===== ACTIVE SUBSCRIPTIONS =====");

        for (Subscription s : subscriptions) {
            System.out.println(s);
        }
    }

    public double calculateMonthlyRevenue() {

        double total = 0;

        for (Subscription s : subscriptions) {
            total += s.getMonthlyFee();
        }

        return total;
    }
}
