package task451;

public enum Group {
    WORK("Работа"),
    FRIENDS("Друзья"),
    FAMILY("Семья"),
    DEFAULT("Без группы");

    private String title;

    Group(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
