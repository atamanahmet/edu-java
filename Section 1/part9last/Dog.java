
public class Dog extends Animal {
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
}
