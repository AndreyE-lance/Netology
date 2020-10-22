package task341;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String login) {
        super("Пользователь " + login + " не найден или неверный пароль.");
    }
}
