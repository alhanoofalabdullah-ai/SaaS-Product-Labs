package src.services;

import src.models.User;
import src.utils.PasswordHasher;

public class AuthService {

    private UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(String email, String password) {

        User user = userService.findByEmail(email);

        if (user == null) {
            return false;
        }

        if (!user.isActive()) {
            return false;
        }

        return PasswordHasher.verifyPassword(password, user.getPasswordHash());
    }

    public boolean hasRole(String email, String requiredRole) {

        User user = userService.findByEmail(email);

        if (user == null) {
            return false;
        }

        return user.getRole().equalsIgnoreCase(requiredRole);
    }
}
