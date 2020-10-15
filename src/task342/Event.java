package task342;

public abstract class Event {
    private String title;
    private int releaseYear;

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
