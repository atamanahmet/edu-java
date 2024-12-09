import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
                new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
                new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" })
        };

        Dealership dealership = new Dealership(cars);
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership.toString());
        System.out
                .println("\nWhich car (at the parking spot) are you interested in? (0 – " + (cars.length - 1) + ").\n");
        int index = scan.nextInt();
        System.out.println("You selected: \n");
        System.out.println(dealership.getCar(index));

        Car newCar = new Car("Bmw", 5000, 2020, "white", new String[] { "tires", "keys" });

        Car[] newCarArray = dealership.addNewCar(cars, newCar);
        System.out.println("\nYou added following car to the database: \n" + newCarArray[cars.length]);
        System.out.println("\nNew Car List: \n" + printAgain(newCarArray));

    }

    public static String printAgain(Car[] newCarArray) {
        String temp = "";
        for (int i = 0; i < newCarArray.length; i++) {
            temp += "\nParking Spot: " + i + "" + newCarArray[i].toString() + "\n";
        }
        return temp;
    }
}
