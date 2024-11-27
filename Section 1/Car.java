import java.util.Arrays;

public class Car {
    private String brand;
    private String color;
    private int year;
    private int km;
    private String[] spareParts;

    public Car(String brand, String color, int year, int km, String[] spareParts) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.km = km;
        this.spareParts = spareParts;

    }

    public String[] getSpareParts() {
        return this.spareParts;
    }

    public void setSpareParts(String[] spareParts) {
        this.spareParts = spareParts;
    }

    public Car(Car source) {
        this.brand = source.brand;
        this.color = source.color;
        this.year = source.year;
        this.km = source.km;
    }

    // public String toString() {
    // return brand + "\n" + color + "\n" + year + "\n" + km + "\n" +
    // Arrays.toString(spareParts);
    // }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getKm() {
        return km;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void applyInsurance(double price) {
        if (price >= 10000) {
            System.out.println("Insurance available.");
        } else if (price < 10000) {
            System.out.println("Not eligable.");
        }
    }
}
