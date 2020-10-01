package task161;

public class Main {
    public static void main(String[] args) {
        Author lTolstoy = new Author("Lev", "Tolstoy", 1828, "Russia");
        Book bookOne = new Book("War and Peace",lTolstoy, 4000,1869);
        Book bookTwo  = new Book("Anna Karenina", lTolstoy, 829, 1877);
        Author hRainwater = new Author("Hank", "Rainwater", 1984,"USA");
        Book bookThree = new Book("Kak pasti kotov", hRainwater, 320,2005);

        User user1 = new User("test1@gmail.com", "Vasia", "Pupkin");
        //User.totalOnline++;
        user1.setNowReading(bookOne);
        System.out.println(user1.toString());
        User user2 = new User("test2@gmail.com", "Vova", "Dudkin");
        //User.totalOnline++;
        user2.setNowReading(bookTwo);
        System.out.println(user2.toString());
        User user3 = new User("test3@gmail.com", "Kolia", "Pipkin");
        //User.totalOnline++;
        user3.setNowReading(bookThree);
        System.out.println(user3.toString());
        System.out.println("Всего он-лайн: "+User.totalOnline);
    }
}
