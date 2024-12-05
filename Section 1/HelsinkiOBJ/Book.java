public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public Book(String a) {
        this.title = a;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

    public void setTitle(String x) {
        this.title = x;
    }
}
