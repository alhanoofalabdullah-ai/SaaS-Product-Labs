package src.models;

public class Response {

    private String customerName;
    private String surveyTitle;
    private int rating;

    public Response(
            String customerName,
            String surveyTitle,
            int rating) {

        this.customerName = customerName;
        this.surveyTitle = surveyTitle;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
