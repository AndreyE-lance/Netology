package task421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> floorQueue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int floor = sc.nextInt();
            if (floor == 0) {
                floorQueue.add(floor);
                break;
            }
            if (floor > 25 || floor < 1) {
                System.out.println("Такого этажа нет в доме");
                continue;
            }
            floorQueue.add(floor);
        }
        printQueue(floorQueue);
    }

    private static void printQueue(Queue<Integer> floorQueue) {
        String arrow = "";
        int previousFloor = -1;
        int currentFloor;
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        while (!floorQueue.isEmpty()) {
            System.out.print(arrow);
            currentFloor = floorQueue.poll();
            if (previousFloor != -1) {
                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
            }
            totalSeconds += waitDoorsInSeconds;
            System.out.print("Этаж " + currentFloor);
            arrow = "->";
        }
        System.out.println();
        System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
    }
}
