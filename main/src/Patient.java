package src;

public class Patient {

    private int id;
    private String name;
    private int age;
    private int practitionerId;

    public Patient() {}

    public Patient(String name, int age, int practitionerId) {
        this.name = name;
        this.age = age;
        this.practitionerId = practitionerId;
    }

    public Patient(int id, String name, int age, int practitionerId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.practitionerId = practitionerId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPractitionerId() {
        return practitionerId;
    }

    public void setPractitionerId(int practitionerId) {
        this.practitionerId = practitionerId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", practitionerId=" + practitionerId +
                '}';
    }
}
