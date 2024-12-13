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

    public Car getCar(int index) {
        Car copy = new Car(cars[index]);
        return copy;
    }

    public Car[] addNewCar(Car[] cars, Car newCar) {

        Car[] newArray = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            newArray[i] = new Car(cars[i]);
        }
        Car copy = new Car(newCar);
        newArray[cars.length] = copy;
        return newArray;
    }

    // public void setCar(int index, Car newCar) {
    // Car copy = new Car(cars[index]);
    // this.cars[index] = copy;
    // }

}
