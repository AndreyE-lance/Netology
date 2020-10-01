package task161;

public class User {

    private String email;
    private String name;
    private String surname;
    public static int totalOnline;
    private Book nowReading;

    public User (String email, String name, String surname) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        User.totalOnline++;
    }

    public void setNowReading(Book nowReading) {
        this.nowReading = nowReading;
    }

    public String toString() {
        return " E-mail:" + email + ", " + name + " " + surname+ "\r\n Сейчас читает: "+(nowReading!=null ? nowReading.toString():"Ничего.");
    }
}