public class AddNewCar {
    public static Car[] addNewCar(Car[] cars, Car newCar) {
        Car[] newArray = new Car[cars.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = new Car(cars[i]);
        }
        Car new = new Car(newCar); 
        return newArray;
    }
}
