package src.models;

public class Comment {

    private int id;
    private int taskId;
    private String author;
    private String message;

    public Comment(int id, int taskId, String author, String message) {

        this.id = id;
        this.taskId = taskId;
        this.author = author;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
