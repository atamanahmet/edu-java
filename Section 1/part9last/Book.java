public class Book {
    // private double weight;
    private String name;
    private int ageReq;
    // private String author;

    public Book(String name, int ageReq) {
        this.ageReq = ageReq;
        this.name = name;
        // this.weight = weight;
    }

    // public double weight() {
    // return this.weight;
    // }

    // public String toString() {
    // return this.author + ": " + this.name;
    // }
    public String toString() {
        return this.name + " (" + "recommended for " + this.ageReq + " year-olds or older)";
    }

    public String getName() {
        return name;
    }

    public int getAgeReq() {
        return ageReq;
    }
}
