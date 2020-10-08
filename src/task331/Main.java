package task331;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        AdminLibrarian adminLibrarian = new AdminLibrarian();
        user.takeBook();
        adminLibrarian.orderBook(user);
    }
}
