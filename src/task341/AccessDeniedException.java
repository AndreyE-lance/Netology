package task341;

public class AccessDeniedException extends Exception {

    public AccessDeniedException(int age) {
        super("Тебе еще только " + age + ". Возвращайся в 18 лет.");
    }
}