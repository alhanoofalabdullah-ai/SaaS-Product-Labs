package src.controllers;

import src.models.User;
import src.services.AuthService;
import src.services.UserService;

public class AuthController {

    private AuthService authService;
    private UserService userService;

    public AuthController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    public void register(String name, String email, String password, String role) {

        User user = userService.createUser(name, email, password, role);

        System.out.println("User registered successfully: " + user.getEmail());
    }

    public void login(String email, String password) {

        boolean success = authService.authenticate(email, password);

        if (success) {
            System.out.println("Login successful: " + email);
        } else {
            System.out.println("Login failed: " + email);
        }
    }

    public void showAllUsers() {

        System.out.println("\n===== USERS =====");

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
    }
}
