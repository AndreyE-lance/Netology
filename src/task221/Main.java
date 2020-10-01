package task221;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void fill(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int[][] matrix, int angle) throws Exception {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (angle) {
                    case 90: {
                        rotatedMatrix[j][SIZE - 1 - i] = matrix[i][j];
                        break;
                    }
                    case 180: {
                        rotatedMatrix[SIZE - 1 - i][SIZE - 1 - j] = matrix[i][j];
                        break;
                    }
                    case 270: {
                        rotatedMatrix[SIZE - j - 1][i] = matrix[i][j];
                        break;
                    }
                    default: {
                        throw new Exception();
                    }
                }
            }
        }
        return rotatedMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        fill(matrix);
        print(matrix);
        System.out.println("Задайте градус поворота (90,180,270):");
        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();
        try {
            rotatedMatrix = rotate(matrix, angle);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так " + e);
        }
        System.out.println();
        print(rotatedMatrix);
    }


}
