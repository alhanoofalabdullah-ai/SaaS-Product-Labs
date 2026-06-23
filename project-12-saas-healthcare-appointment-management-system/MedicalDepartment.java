package src.models;

public class MedicalDepartment {

    private int id;
    private String name;

    public MedicalDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
