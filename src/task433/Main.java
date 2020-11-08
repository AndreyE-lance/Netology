package task433;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Set<Transport> transports = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (!isAuto()) {
            while (true) {
                System.out.println("Введите информацию об автомобиле (в формате: номер, марка, цвет, тип автомобиля):");
                String[] input = scanner.nextLine().split(", ");
                if (input[0].equals("")) break;
                if (input.length == 3) {
                    Transport t = new Transport(input[0], input[1], input[2], "Другой");
                    addTransport(t);
                } else if (input.length == 4) {
                    Transport t;
                    if (input[3].equals("легковой")) {
                        t = new Passenger(input[0], input[1], input[2]);
                    } else {
                        t = new Truck(input[0], input[1], input[2]);
                    }
                    addTransport(t);
                }
            }
        }
        printTransport();
    }

    public static void addTransport(Transport t) {
        if (!transports.add(t)) {
            System.out.println("ТС с таким номером уже зарегистрировано.");
        }
    }

    public static void printTransport() {
        System.out.println("Легковые:");
        transports.forEach(t -> {
            if (t instanceof Passenger) {
                System.out.println('\t' + t.toString());
            }
        });
        System.out.println("Грузовые:");
        transports.forEach(t -> {
            if (t instanceof Truck) {
                System.out.println('\t' + t.toString());
            }
        });
        System.out.println("Другие:");
        transports.forEach(t -> {
            if (!(t instanceof Truck) && !(t instanceof Passenger)) {
                System.out.println('\t' + t.toString());
            }
        });
    }

    private static boolean isAuto() {
        while (true) {
            System.out.println("Добавить автомобили автоматически и вывести на экран?[y/n]");
            String input = scanner.nextLine();
            if (input.equals("n")) {
                return false;
            } else if (input.equals("y")) {
                autoAppend();
                return true;
            }
        }
    }

    private static void autoAppend() {
        addTransport(new Truck("А123МК123", "МАЗ", "Белый"));
        addTransport(new Transport("А125МК123", "Богдан", "Желтый", "Другой"));
        addTransport(new Passenger("А123МК123", "ВАЗ-2107", "Белый"));
        addTransport(new Truck("А120МК123", "КАМАЗ", "Оранжевый"));
        addTransport(new Passenger("А127МК123", "ВАЗ-2108", "Красный"));
        addTransport(new Passenger("А128МК123", "ВАЗ-2109", "Зеленый"));
        addTransport(new Transport("А121МК123", "Газель", "Желтый", "Другой"));
        addTransport(new Truck("А123МК123", "БелАЗ", "Желтый"));

    }
}
