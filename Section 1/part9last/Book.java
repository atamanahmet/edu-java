public class Book implements Packables {
    private double weight;
    private String name;
    private String author;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.author + ": " + this.name;
    }
}
