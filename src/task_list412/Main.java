package task_list412;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");
            String[] person= scanner.nextLine().split(" ");
            list.add(new Employee(person[0],person[1],Integer.parseInt(person[2]),person[3],person[4],person[5],person[6]));
            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Фамилия     Имя     Возраст Пол     Образование Должность   Отдел");
                list.forEach(c-> System.out.println(c.toString()));
                break;
            }
        }
    }

}
