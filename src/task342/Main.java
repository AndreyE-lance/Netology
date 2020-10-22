package task342;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{new Movie("Начало", 2010, 16),
                new Movie("Олдбой", 2003, 18),
                new Movie("Унесенные ветром", 1939, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Макбет", 2020, 18),
                new Theatre("Золотой ключик", 2019, 3)
        };
    }

    public static void validEvent(Event event) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (event.getTitle() == null) {
            stringBuilder.append("Название события не может быть null. ");
        }
        if (event.getReleaseYear() == 0) {
            stringBuilder.append("Дата релиза не может быть равной 0. ");
        }
        if (event.getAge() == 0) {
            stringBuilder.append("Возрастной ценз не может иметь значение 0. ");
        }
        if (!stringBuilder.toString().equals("")) {
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}
