package src.models;

public class User {

    private int id;
    private String name;
    private String email;
    private String passwordHash;
    private String role;
    private boolean active;

    public User(int id, String name, String email, String passwordHash, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
        this.active = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        this.active = false;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + email + " | " + role + " | Active: " + active;
    }
}
