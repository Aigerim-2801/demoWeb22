package entities;

public class Medicines {
    private int id;
    private String name;
    private String surname;
    private boolean gender;

    public Medicines() {

    }

    public Medicines(String name, String surname, boolean gender) {
        setName(name);
        setSurname(surname);
        setGender(gender);
    }

    public Medicines(int id, String name, String surname, boolean gender) {
        setId(id);
        setName(name);
        setSurname(surname);
        setGender(gender);
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void myFunction() {

    }

    @Override
    public String toString() {
        return "Medicines{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + (gender ? "Male" : "Female") +
                '}';
    }
}
