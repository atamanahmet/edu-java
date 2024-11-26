public class CarObject {
    String brand;
    String color;
    int year;
    int km;

    public CarObject(String brand, String color, int year, int km) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.km = km;
    }

    public String toString() {
        return brand + "\n" + color + "\n" + year + "\n" + km;
    }
}
