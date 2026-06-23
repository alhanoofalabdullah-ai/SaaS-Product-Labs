package src.models;

public class Survey {

    private int id;
    private String title;

    public Survey(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
