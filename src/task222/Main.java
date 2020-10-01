package task222;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        GameField gameField = new GameField(SIZE);
        Scanner scanner = new Scanner(System.in);
        int movies = 30;
        while (true) {
            if(movies==0) break;
            System.out.println(String.format("Введите координаты для атаки (осталось торпед %d):", movies));
            movies--;
            String[] coordinates = scanner.nextLine().split(":");
            int result = gameField.shotResult(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
            switch (result){
                case 0:
                    System.out.println("Мимо!");
                    break;
                case 1:
                    System.out.println("Попадание!");
                    if (gameField.getShips() == 0) break;
                    gameField.printField();
                    break;
                case 2:
                    System.out.println("Этот корабль уже подбит!");
                    break;
                case 3:
                    System.out.println("В это пустое поле вы уже стреляли.");
                    break;
                case -1:
                    System.out.println("Введены неверные координаты.");
                    break;
            }
        }
        if(gameField.getShips() == 0){
            System.out.println("Победа! \n Все корабли уничтожены за "+movies+" ходов!");
            gameField.printField();
        } else {
            System.out.println("Поражение! \n Больше не осталось торпед. Количество неподбитых вражеских кораблей: "+gameField.getShips());
            gameField.printField();
        }

    }
}
