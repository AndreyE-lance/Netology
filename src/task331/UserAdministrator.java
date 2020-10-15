package task331;

public class UserAdministrator extends User implements Administrator, Reader{
    public UserAdministrator(String name) {
        super(name);
    }

    @Override
    public boolean findBook() {
        return false;
    }

    @Override
    public void giveBook(Reader reader) {
        System.out.println("Администратор " +getName()+ " выдал книгу.");
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " +getName()+ " ссобщает о просрочке.");
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Пользователь " +getName()+ " взял книгу.");
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Пользователь " +getName()+ " вернул книгу.");
    }
}
