package task341;

import java.util.Scanner;

public class Main {

    public static User[] getUsers() {
        User user1 = new User("Vasia", "12345", 15, "vasia@sveta.net");
        User user2 = new User("Piter", "qwerty", 20, "petya@sveta.net");
        User user3 = new User("helga1992", "sadji34", 18, "olya@sveta.net");
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password))
                return user;
        }
        throw new UserNotFoundException(login);
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18)
            throw new AccessDeniedException(user.getAge());
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Доступ представлен");
    }
}