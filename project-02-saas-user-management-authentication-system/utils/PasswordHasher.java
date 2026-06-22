package src.utils;

public class PasswordHasher {

    public static String hashPassword(String password) {
        return "HASHED_" + password;
    }

    public static boolean verifyPassword(String rawPassword, String storedHash) {
        return storedHash.equals(hashPassword(rawPassword));
    }
}
