package task331;

public interface Administrator {
    boolean findBook();
    void giveBook(Reader reader);
    void overdueNotification(Reader reader);
}
