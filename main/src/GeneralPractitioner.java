package src;

public class GeneralPractitioner {

    private int id;
    private String name;
    private String specialty;

    public GeneralPractitioner() {}

    public GeneralPractitioner(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public GeneralPractitioner(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "GeneralPractitioner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
