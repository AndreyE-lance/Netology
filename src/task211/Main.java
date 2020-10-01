package task211;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumProducts = 0;
        String[] products = new String[]{"Яблоки", "Груши", "Бананы", "Апельсины", "Персики"};
        int[] prices = new int[]{100, 120, 150, 90, 200};
        StringBuilder stringBuilder = new StringBuilder("Наименование товара   Количество  Цена/за.ед  Общая стоимость\n");
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));
        for (int i = 0; i < products.length; i++) {
            System.out.println(String.format("%d. %-15s цена: %d", i + 1, products[i], prices[i]));
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                stringBuilder.append("ИТОГО: "+sumProducts);
                System.out.println(stringBuilder);
                break;
            } else {
                String[] splitedString = inputString.split(" ");
                int productNumber;
                int productCount;
                try {
                    productNumber = Integer.parseInt(splitedString[0]);
                    productCount = Integer.parseInt(splitedString[1]);
                    stringBuilder.append(String.format("%-21s %-11d %-11d %d\n",products[productNumber-1], productCount,prices[productNumber-1], productCount*prices[productNumber-1]));
                    sumProducts+=productCount*prices[productNumber-1];
                } catch (Exception e) {
                    System.out.println("Что-то пошло не так.\n" + e);
                }
            }
        }


    }
}
