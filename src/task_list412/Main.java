package task_list412;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");
            String[] person = scanner.nextLine().split(" ");
            list.add(new Employee(person[0], person[1], Integer.parseInt(person[2]), person[3], person[4], person[5], person[6]));
            System.out.println("Если хотите закончить ввод данных, введите end, если хотите добавить еще одного сотрудника - enter");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                printList(list);
                break;
            }
        }


        System.out.println("Изменить атрибуты? [y/n]");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            if (list.isEmpty()) {
                System.out.println("Список пуст. Работа завершена.");
            } else {
                while (true) {
                    System.out.println("Введите фамилию и имя работника, для которого хотите изменить данные");
                    String surname = scanner.next();
                    String name = scanner.next();

                    int empIndex = searchBySurname(surname, name, list);
                    if (empIndex != -1) {
                        Employee employee = list.get(empIndex);
                        changeProperties(list, employee);
                        break;
                    }
                }
                printList(list);
            }
        } else {
            System.out.println("Работа завершена.");
        }
    }

    private static void changeProperties(List<Employee> list, Employee employee) {
        while (true) {
            System.out.println(employee.forChangeString());
            System.out.println("Введите номер атрибута для изменения: ");
            String attr;
            int pos = scanner.nextInt();
            switch (pos) {
                case 1:
                    System.out.println("Введите новую фамилию");
                    scanner.nextLine();
                    attr = scanner.nextLine();
                    employee.setSurname(attr);
                    break;
                case 2:
                    System.out.println("Введите нове имя");
                    scanner.nextLine();
                    attr = scanner.nextLine();
                    employee.setName(attr);
                    break;
                case 3:
                    System.out.println("Введите новый возраст");
                    scanner.nextLine();
                    attr = scanner.nextLine();
                    employee.setAge(Integer.parseInt(attr));
                    break;
                case 4:
                    System.out.println("Введите новый пол");
                    scanner.nextLine();
                    attr = scanner.nextLine();
                    employee.setSex(attr);
                    break;
                case 5:
                    System.out.println("Введите новые данные об образовании");
                    scanner.nextLine();
                    attr = scanner.nextLine();
                    employee.setBackground(attr);
                    break;
                case 6:
                    System.out.println("Введите новую должность");
                    scanner.nextLine();
                    attr = scanner.nextLine();
                    employee.setPosition(attr);
                    break;
                case 7:
                    System.out.println("Введите новый отдел");
                    scanner.nextLine();
                    attr = scanner.nextLine();
                    employee.setDepartment(attr);
                    break;
            }
            System.out.println("Желаете изменить другие атрибуты этого сотрудника? [y/n]");
            String answer = scanner.nextLine();
            if (answer.equals("n")) break;
        }
    }

    private static void printList(List<Employee> list) {
        System.out.println("Фамилия     Имя     Возраст Пол     Образование Должность   Отдел");
        list.forEach(c -> System.out.println(c.toString()));
    }

    private static int searchBySurname(String surname, String name, List<Employee> list) {
        int result = -1;
        for (Employee e : list) {
            result++;
            if (e.getName().equals(name) && e.getSurname().equals(surname)) return result;
        }
        return result;
    }

}
