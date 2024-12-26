public class Cat extends Animal implements NoiseCapable {
    private String name;

    public Cat() {
        this("Cat");
    }

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public void purr() {
        System.out.println(this.name + " purrs");
    }

    public void makeNoise() {
        this.purr();
    }

}
