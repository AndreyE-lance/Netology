package task453;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    private static Map<String, User> users = new TreeMap<>();
    private static Map<String, HashSet<String>> usersIps = new HashMap<>();
    private static Map<String, Integer> loggedIps = new HashMap<>();
    private static File file;
    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        fillUserMap();
        fillLoggedIpsMap();

        AtomicInteger maxValue = new AtomicInteger();
        AtomicReference<String> ip = new AtomicReference<>("");
        loggedIps.forEach((k, v) -> {
            if (v > maxValue.get()) {
                ip.set(k);
                maxValue.set(v);
            }
        });
        //showAllMaps();

        AtomicReference<String> villainId = new AtomicReference<>("");
        usersIps.forEach((k, v) -> {
            if (v.contains(ip.toString())) {
                villainId.set(k);
            }
        });
        StringBuilder sBuilder = new StringBuilder("Предполагаемый злоумышленник:\n");
        sBuilder.append(users.get(villainId.toString()).toString())
                .append("\nКоличество входов: ")
                .append(maxValue);
        System.out.println(sBuilder.toString());
    }


    private static void fillLoggedIpsMap() throws FileNotFoundException {
        file = new File("src/task453/server.log");
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(":");
            if (loggedIps.containsKey(input[0])) {
                loggedIps.put(input[0], loggedIps.get(input[0]) + 1);
            } else {
                loggedIps.put(input[0], 1);
            }
        }
    }

    private static void fillUserMap() throws FileNotFoundException {
        file = new File("src/task453/users.db");
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(";");
            if (input[0].equals("ip")) continue;
            users.put(input[1], new User(input[1], input[2], input[3]));
            if (usersIps.containsKey(input[1])) {
                usersIps.get(input[1]).add(input[0]);
            } else {
                usersIps.put(input[1], new HashSet<String>() {{
                    add(input[0]);
                }});
            }
        }
        scanner.close();
    }

    private static void showAllMaps() {
        users.forEach((k, v) -> System.out.println(k + " " + v.toString()));
        System.out.println("++++++++++++++++++++++++++++++");
        usersIps.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(hash -> System.out.println("\t" + hash));
        });
        System.out.println("++++++++++++++++++++++++++++++");
        loggedIps.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
