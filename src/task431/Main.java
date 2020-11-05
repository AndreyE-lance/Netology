package task431;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static PhoneContacts pContacts = new PhoneContacts();

    public static void main(String[] args) {
        if (!isAuto()) {
            handInput();
        }
        System.out.println(pContacts.toString());
        System.out.println("Отсортированый список: ");
        pContacts.toSortedList().forEach(v -> System.out.println(v.toString()));
    }

    private static void handInput() {
        System.out.println("Введите название группы контактов:");
        while (true) {
            String group = scanner.nextLine();
            if (group.equals("нет")) break;
            pContacts.addGroup(group);
            System.out.println("Создать еще одну группу (введите название или введите нет)?");
        }
        while (true) {
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String[] contact = scanner.nextLine().split(" ");
            if (contact[0].equals("нет")) break;
            System.out.println("Укажите группы контакта через пробел");
            String[] groups = scanner.nextLine().split(" ");
            for (String s: groups) {
                pContacts.addContact(s,new Contact(contact[0]+" "+contact[1], contact[2]));
            }
        }
    }

    private static boolean isAuto() {
        while (true) {
            System.out.println("Добавить группы и контакты автоматически и вывести на экран?[y/n]");
            String input = scanner.nextLine();
            if (input.equals("n")) {
                return false;
            } else if (input.equals("y")) {
                autoAppend();
                return true;
            }
        }
    }

    public static void autoAppend() {
        pContacts.addGroup("Работа");
        pContacts.addGroup("Семья");
        pContacts.addContact("Работа", new Contact("Вася", "7-10-99"));
        pContacts.addContact("Семья", new Contact("Петя", "234-234-247"));
        pContacts.addContact("Семья", new Contact("Маша", "234-098-564"));
        pContacts.addContact("Работа", new Contact("Маша", "234-098-564"));
        pContacts.addContact("Работа", new Contact("Ваня", "234-098-564"));
    }
}
