package task331;

public class Main {
    public static void main(String[] args) {
        UserAdministrator userAdministrator = new UserAdministrator("AdminReader");
        UserSupplier userSupplier = new UserSupplier("UserSupp");
        userSupplier.takeBook(userAdministrator);
        userAdministrator.giveBook(userAdministrator);
        userAdministrator.overdueNotification(userSupplier);
        userSupplier.returnBook(userAdministrator);
    }
}
