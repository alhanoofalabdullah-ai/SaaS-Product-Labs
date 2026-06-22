package src.services;

public class NotificationService {

    public void sendNotification(
            String customer,
            String message) {

        System.out.println(
                "Notification sent to "
                        + customer +
                        ": "
                        + message);
    }
}
