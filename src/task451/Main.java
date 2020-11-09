package task451;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();
    private static MissedCalls missedCalls = new MissedCalls();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            boolean exit = false;
            int posMenu = scanner.nextInt();
            switch (posMenu) {
                case 1:
                    addContact();
                    break;
                case 2:
                    addMissedCall();
                    break;
                case 3:
                    missedCalls.showMissedCalls(contacts);
                    break;
                case 4:
                    missedCalls.clearMissedList();
                    break;
                case 5:
                    editContact();
                    break;
                case 6:
                    deleteContact();
                    break;
                case 7:
                    exit = true;
            }
            if (exit) break;
        }
    }


    public static void printMenu() {
        StringBuilder sBuilder = new StringBuilder("Меню\n");
        sBuilder.append("\t1. Добавить контакт\n")
                .append("\t2. Добавить пропущенный вызов\n")
                .append("\t3. Вывести все пропущенные вызовы\n")
                .append("\t4. Очистить пропущенные вызовы\n")
                .append("\t5. Редактировать контакт\n")
                .append("\t6. Удалить контакт\n")
                .append("\t7. Выход\n")
                .append("Выберите пункт из меню (1-7):\n");
        System.out.println(sBuilder.toString());
    }

    public static void addContact() {
        System.out.println("Введите данные о контакте в формате: имя, фамилия, телефон, группа");
        scanner.nextLine();
        String[] input = scanner.nextLine().split(", ");
        Group group = Group.DEFAULT;
        if (input.length == 4) {
            switch (input[3]) {
                case "друзья":
                    group = Group.FRIENDS;
                    break;
                case "семья":
                    group = Group.FAMILY;
                    break;
                case "работа":
                    group = Group.WORK;
                    break;
            }
        }
        Contact contact = new Contact(input[0], input[1], input[2], group);
        contacts.addContact(contact);
        System.out.println("Контакт добавлен: " + contact.toString());
    }

    public static void addMissedCall() {
        System.out.println("Введите номер телефона пропущеного вызова");
        scanner.nextLine();
        String input = scanner.nextLine();
        missedCalls.addMissedCall(input);
    }

    private static void deleteContact() {
        System.out.println(contacts.toString());
        System.out.println("Введите данные о контакте в формате: имя, фамилия");
        scanner.nextLine();
        String[] input = scanner.nextLine().split(", ");
        contacts.deleteContact(input[0], input[1]);
    }

    private static void editContact() {
        System.out.println("Введите номер контакта для редактирования или 0 для выхода");
        System.out.println(contacts.toString());
        scanner.nextLine();
        int i = scanner.nextInt();
        if (i == 0) return;
        System.out.println("Введите новые данные о контакте в формате: имя, фамилия, группа");
        scanner.nextLine();
        String[] input = scanner.nextLine().split(", ");
        Group group = Group.DEFAULT;
        switch (input[2]) {
            case "друзья":
                group = Group.FRIENDS;
                break;
            case "семья":
                group = Group.FAMILY;
                break;
            case "работа":
                group = Group.WORK;
                break;
        }
        contacts.editContact(i, input[0], input[1], group);
        editContact();
    }
}
