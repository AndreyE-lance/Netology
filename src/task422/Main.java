package task422;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();
        Stack<String> sign = new Stack<>();
        Queue<String> numbers = new ArrayDeque<>();
        String[] arrayValues = input.split(" ");
        for (int i = 0; i < arrayValues.length; i++) {
            String value = arrayValues[i];
            if (value.matches("^[0-9]*$")) {
                numbers.add(value);
            } else {
                if (sign.isEmpty() || value.equals("(")) {
                    sign.push(value);
                } else {
                    if ((sign.peek().equals("*") || sign.peek().equals("/")) && !value.equals(")")) {
                        if (!sign.peek().equals("(")) {
                            numbers.add(sign.pop());
                        }
                        sign.push(value);
                    } else {
                        if (value.equals("*") || value.equals("/")) {
                            sign.push(value);
                        } else {
                            if (value.equals(")")) {
                                while (!sign.peek().equals("(")) {
                                    numbers.add(sign.pop());
                                }
                                sign.pop();
                            } else {
                                if (!sign.peek().equals("(")) {
                                    numbers.add(sign.pop());
                                }
                                sign.push(value);
                            } //6,10, +, 4, -, 1, 1, 2, *, +, /, 1, +
                        }
                    }
                }
            }
        }
        while (!sign.isEmpty()) {
            numbers.add(sign.pop());
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

    }
}
