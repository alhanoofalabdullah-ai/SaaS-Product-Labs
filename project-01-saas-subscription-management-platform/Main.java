package src;

import src.services.SubscriptionService;

public class Main {

    public static void main(String[] args) {

        SubscriptionService service = new SubscriptionService();

        service.addSubscription("Ahmed", "Professional", 99.99);
        service.addSubscription("Sara", "Basic", 29.99);
        service.addSubscription("Khalid", "Enterprise", 299.99);

        service.displaySubscriptions();

        System.out.println("\nMonthly Revenue: $" +
                service.calculateMonthlyRevenue());
    }
}
