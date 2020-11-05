package task431;


public class Contact implements Comparable<Contact>{
    public String getName() {
        return name;
    }

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "Имя: " + name +
                ", Телефон: " + phoneNumber;
    }


    @Override
    public int compareTo(Contact o) {
        return name.compareTo(o.getName());
    }
}
