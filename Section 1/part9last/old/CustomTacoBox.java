public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public void eat() {
        this.tacos--;
    }

    public int tacosRemaining() {
        return this.tacos;
    }
}
