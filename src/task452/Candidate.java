package task452;

public class Candidate {
    private String fullName;
    private String sex;
    private String age;
    private int relevance;
    private int rating;

    public Candidate(String fullName, String sex, String age, int relevance, int rating) {
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return fullName + ", " +
                relevance + "," +
                rating;
    }
}
