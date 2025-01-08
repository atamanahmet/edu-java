public class Organism implements Movable {
    private int dx;
    private int dy;

    public Organism() {
        this.dx = 0;
        this.dy = 0;
    }

    public Organism(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void move(int dx, int dy) {
        this.dx = this.dx + dx;
        this.dy = this.dy + dy;
    }

    public String toString() {
        return "x: " + this.dx + "; " + "y: " + this.dy;
    }
}
