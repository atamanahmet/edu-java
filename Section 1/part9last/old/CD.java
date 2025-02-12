public class CD implements Packables {
    private String artist;
    private String name;
    private int publicationYear;
    private double weight;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }
}
