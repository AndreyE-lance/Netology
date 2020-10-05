package task311;

import java.sql.SQLOutput;

public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.ARCHIVED) {
            switch (requestedStatus) {
                case ARCHIVED:
                    System.out.println("Книга уже имеет статус " + book.getStatus());
                    break;
                case BORROWED:
                    System.out.println("Нельзя перевести книгу из статуса " + book.getStatus() + " в статус " + Status.BORROWED);
                    break;
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    System.out.println("Статус изменен на " + book.getStatus());
                    break;
                case OVERDUED:
                    System.out.println("Нельзя перевести книгу из статуса " + book.getStatus() + " в статус " + Status.OVERDUED);
                    break;
            }
        }else{
            System.out.println("Книга должна иметь статус "+ Status.ARCHIVED+". Текущий статус "+book.getStatus()+". Изменение статуса не завершено.");
        }
    }
}
