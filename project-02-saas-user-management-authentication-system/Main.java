package src;

import src.controllers.AuthController;
import src.services.AuthService;
import src.services.UserService;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        AuthService authService = new AuthService(userService);
        AuthController controller = new AuthController(authService, userService);

        controller.register("Alhanoof", "alhanoof@example.com", "Admin123", "ADMIN");
        controller.register("Sara", "sara@example.com", "Sara123", "CUSTOMER");
        controller.register("Ahmed", "ahmed@example.com", "Ahmed123", "SUPPORT");

        controller.login("alhanoof@example.com", "Admin123");
        controller.login("sara@example.com", "WrongPassword");

        controller.showAllUsers();
    }
}
