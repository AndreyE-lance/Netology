package task311;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир");
        FromAvailableStatusMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book,Status.BORROWED);
        FromArchivedStatusMover fromArchivedStatusMover= new FromArchivedStatusMover();
        fromArchivedStatusMover.moveToStatus(book,Status.ARCHIVED);
        System.out.println(book.getStatus());
    }
}
