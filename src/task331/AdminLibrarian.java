package task331;

public class AdminLibrarian implements Librarian,Administrator{
    @Override
    public boolean findBook() {
        return true;
    }

    @Override
    public void giveBook(Reader reader) {
        if(findBook()){
        reader.takeBook();} else {
            System.out.println("Такой книги нет");
        }
    }

    @Override
    public void overdueNotification(Reader reader) {

    }

    @Override
    public void orderBook(Supplier supplier) {
        supplier.deliveryBook();
    }
}
