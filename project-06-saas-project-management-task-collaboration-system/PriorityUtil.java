package src.utils;

public class PriorityUtil {

    public static boolean isValidPriority(String priority) {

        return priority.equalsIgnoreCase("LOW")
                || priority.equalsIgnoreCase("MEDIUM")
                || priority.equalsIgnoreCase("HIGH")
                || priority.equalsIgnoreCase("CRITICAL");
    }
}
