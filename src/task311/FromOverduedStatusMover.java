package task311;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.OVERDUED) {
            switch (requestedStatus) {
                case OVERDUED:
                    System.out.println("Книга уже имеет статус " + book.getStatus());
                    break;
                case BORROWED:
                    System.out.println("Нельзя перевести книгу из статуса " + book.getStatus() + " в статус " + Status.OVERDUED);
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
            System.out.println("Книга должна иметь статус " + Status.OVERDUED + ". Текущий статус " + book.getStatus() + ". Изменение статуса не завершено.");
        }
    }
}
