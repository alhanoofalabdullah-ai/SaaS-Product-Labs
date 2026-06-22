package src.services;

import src.models.User;
import src.utils.PasswordHasher;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();
    private int nextId = 1;

    public User createUser(String name, String email, String password, String role) {

        String hashedPassword = PasswordHasher.hashPassword(password);

        User user = new User(nextId, name, email, hashedPassword, role);

        users.add(user);
        nextId++;

        return user;
    }

    public User findByEmail(String email) {

        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }

        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void deactivateUser(String email) {

        User user = findByEmail(email);

        if (user != null) {
            user.deactivate();
        }
    }
}
