package task453;

public class User {
    private String id;
    private String fullName;
    private String address;

    public User(String id, String fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName +
                "\nАдрес: " + address;
    }
}
