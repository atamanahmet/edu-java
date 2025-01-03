import java.util.Arrays;

public class Car {
    private String brand;
    private String color;
    private int year;
    private int km;
    private String[] spareParts;

    public Car(String brand, int km, int year, String color, String[] spareParts) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.km = km;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);

    }

    public String[] getSpareParts() {
        return Arrays.copyOf(this.spareParts, this.spareParts.length);
    }

    public void setSpareParts(String[] spareParts) {
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    public Car(Car source) {
        this.brand = source.brand;
        this.color = source.color;
        this.year = source.year;
        this.km = source.km;
        this.spareParts = Arrays.copyOf(source.spareParts, source.spareParts.length);
    }

    public String toString() {
        return "\nBrand: " + brand + "\nColor: " + color + "\nYear: " + year + "\nKm: " + km + "\nSpare Parts: " +
                Arrays.toString(spareParts);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int getKm() {
        return this.km;
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
