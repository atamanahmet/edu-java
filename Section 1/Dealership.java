public class Dealership {

    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "\nParking Spot: " + i + "" + cars[i].toString() + "\n";
        }
        return temp;
    }

    public String getCar(int index) {
        return this.cars[index].toString();
    }

}
