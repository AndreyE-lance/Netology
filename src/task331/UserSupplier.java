package task331;

public class UserSupplier extends User implements Supplier, Reader {
    public UserSupplier(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Читатель" + getName() + " взял книгу.");
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Читатель" + getName() + " вернул книгу.");
    }

    @Override
    public void deliveryBook(Librarian librarian) {
        System.out.println("Поставщик " + getName() + " доставил книги.");
    }
}
