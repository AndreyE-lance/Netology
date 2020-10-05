package task311;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.BORROWED) {
        switch (requestedStatus) {
            case BORROWED:
                System.out.println("Книга уже имеет статус " + book.getStatus());
                break;
            case OVERDUED:
                book.setStatus(Status.OVERDUED);
                System.out.println("Статус изменен на " + book.getStatus());
                break;
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                System.out.println("Статус изменен на " + book.getStatus());
                break;
            case AVAILABLE:
                book.setStatus(Status.AVAILABLE);
                System.out.println("Статус изменен на " + book.getStatus());
                break;
        }
        } else {
            System.out.println("Книга должна иметь статус " + Status.BORROWED + ". Текущий статус " + book.getStatus() + ". Изменение статуса не завершено.");
        }
    }
}
