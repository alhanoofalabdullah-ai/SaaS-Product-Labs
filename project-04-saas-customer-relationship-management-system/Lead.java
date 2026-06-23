package src.models;

public class Lead {

    private String company;
    private String source;

    public Lead(String company,
                String source) {

        this.company = company;
        this.source = source;
    }

    public String getCompany() {
        return company;
    }

    public String getSource() {
        return source;
    }
}
