package src.controllers;

import src.services.SubscriptionService;

public class SubscriptionController {

    private SubscriptionService service;

    public SubscriptionController(
            SubscriptionService service) {

        this.service = service;
    }

    public void createSubscription(
            String customer,
            String plan,
            double fee) {

        service.addSubscription(
                customer,
                plan,
                fee);
    }
}
