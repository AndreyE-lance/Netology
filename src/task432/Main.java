package task432;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Set<Student> students = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
        while (true) {
            String[] input = scanner.nextLine().split(", ");
            if (input[0].equals("end")) break;
            try {
                if (!students.add(new Student(input[0], input[1], input[2]))) {
                    System.out.println("Студент с таким номером студенческого билета уже зарегистрирован.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
        }
        students.forEach(s -> System.out.println(s.toString()));
    }
}
