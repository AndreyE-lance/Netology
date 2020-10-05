package task311;

public class FromAvailableStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.ARCHIVED) {
        switch (requestedStatus) {
            case AVAILABLE:
                System.out.println("Книга уже имеет статус " + book.getStatus());
                break;
            case BORROWED:
                book.setStatus(Status.BORROWED);
                System.out.println("Статус изменен на " + book.getStatus());
                break;
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                System.out.println("Статус изменен на " + book.getStatus());
                break;
            case OVERDUED:
                System.out.println("Нельзя перевести книгу из статуса " + book.getStatus() + " в статус " + Status.OVERDUED);
                break;
        }
        }else{
            System.out.println("Книга должна иметь статус "+ Status.AVAILABLE+". Текущий статус "+book.getStatus()+". Изменение статуса не завершено.");
        }
    }
}
