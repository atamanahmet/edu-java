
public class Dog extends Animal implements NoiseCapable {
    private String name;

    public Dog() {
        this("Dog");
    }

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + " barks");
    }

    public void makeNoise() {
        this.bark();
    }
}
