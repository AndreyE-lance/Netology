package task161;

public class Book  {
    private String title;
    private Author author;
    private int pages;
    private int year;

    public Book (String title, Author author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public boolean equals(Book book){
        if((this.title.equals(book.title))&&(this.author.equals(book.author))&&(this.pages==book.pages)&&(this.year==book.year)){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return author + ", " +title +", " +
                pages + " страниц. Издано в " +
                year + " году";

    }
}