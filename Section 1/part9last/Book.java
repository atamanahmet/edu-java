public class Book implements Packables {
    private double weight;
    private String name;
    private String author;

    public Book(String author, String name, int weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public double weight() {
        return this.weight;
    }
}
