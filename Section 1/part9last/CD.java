public class CD implements Packables {
    private String artist;
    private String name;
    private double weight;

    public CD(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }
}
