public class CarObject {
    private String brand;
    private String color;
    private int year;
    private int km;

    public CarObject(String brand, String color, int year, int km) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.km = km;
    }

    public String toString() {
        return brand + "\n" + color + "\n" + year + "\n" + km;
    }

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
}
