package Homework;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }

            System.out.println();
        }
        int[][] rotateColors = new int[SIZE][SIZE];

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Введите угол поворота на который необходимо повернуть матрицу 90/180/270 и нажмите <enter> ");
        String cornerLine = scanner.nextLine();
        if (cornerLine.equals("90")) {
            rotateColors = turnToRight(colors);
        }else if (cornerLine.equals("180")) {
            rotateColors = turnToRight(colors);
            rotateColors = turnToRight(rotateColors);
        } else if (cornerLine.equals("270")) {
            rotateColors = turnToRight(colors);
            rotateColors = turnToRight(colors);
            rotateColors = turnToRight(colors);
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotateColors[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] turnToRight ( int[][] array){
        int[][] resultArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[j][SIZE - i - 1] = array[i][j];
            }
        }
        return resultArray;
    }
}