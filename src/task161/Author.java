package task161;

public class Author {
    private String name;
    private String surname;
    private int birthday;
    private String country;

    public Author ( String name, String surname, int birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    public String toString() {
        return name + " " + surname;

    }
}
