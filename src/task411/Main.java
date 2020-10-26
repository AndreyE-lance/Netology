package task411;

public class Main {

    public static void main(String a[]) {
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        Box<String> sample2 = new Box<>("1");/*<-В параметре указан String,
                                                 а в конструктор попытка передать целое число.
                                                 Число взято в кавычки.*/
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
