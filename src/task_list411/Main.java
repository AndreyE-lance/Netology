package task_list411;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            printMenu();
            String input = scanner.nextLine();
            if (input.equals("0")) break;
            switch (input) {
                case "1":
                    while (true) {
                        System.out.println("Введите название задачи (для завершения введите end)");
                        String task = scanner.nextLine();
                        if (task.equals("end")) {
                            showTasks(list);
                            break;
                        }
                        list.add(task);
                    }
                    break;
                case "2":
                    if (!list.isEmpty()) showTasks(list);
                    else System.out.println("Список пуст");
                    break;
                case "3":
                    while (true) {
                        System.out.println("Введите номер задачи для удаления(для завершения введите Finish)");
                        if (list.isEmpty()) {
                            System.out.println("Список пуст");
                            break;
                        }
                        String task = scanner.nextLine();
                        if (task.equals("Finish")) {
                            showTasks(list);
                            break;
                        }
                        try {
                            list.remove(Integer.parseInt(task) - 1);
                        } catch (Exception e) {
                            System.out.println("Некорректный ввод или неверный номер задачи - " + task);
                        }
                    }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");
    }

    public static void showTasks(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

}
