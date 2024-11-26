// import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {
        // Car car1 = new Car();
        // Car car2 = new Car();
        // System.out.println(car1.brand);
        // car1.brand = "Opel";
        // System.out.println(car1.brand);
        // car2.brand = "Corsa";
        // car2.year = 2023;
        // // System.out.println(String.valueOf(car2));
        // System.out.println(car2.brand + " " + car2.year);
        // car1.drive();
        // Person ataman = new Person();
        // ataman.name = "ahmet";
        // ataman.nationality = "Turkey";
        // ataman.dateOfBirth = "1992";
        // ataman.passport = new String[] { ataman.name, ataman.nationality,
        // ataman.dateOfBirth };
        // ataman.seatNumber = 18;
        // // System.out.println(Arrays.toString(ataman.passport));
        // System.out.println(ataman.name);
        // System.out.println(ataman.nationality);
        // System.out.println(ataman.dateOfBirth);
        // System.out.println(Arrays.toString(ataman.passport));
        // System.out.println(ataman.seatNumber);

        // Car corsa = new Car("Opel", "White", 2023, 9000);

        // System.out.println(corsa);
        // Person ataman = new Person("Ahmet", "Turkey", "01/01/1992", 17);
        // System.out.println(ataman.toString());

        // Car corsa = new Car("Opel", "White", 2023, 8700);
        // // System.out.println(corsa.toString());
        // System.out.println(corsa.getBrand());
        // corsa.setBrand("Ford");
        // System.out.println(corsa.getBrand());
        // System.out.println(corsa.toString());

        // Person ataman = new Person("Ahmet", "Turkish", "1/1/92", 17);
        // // System.out.println(ataman.toString());
        // System.out
        // .println("Name: " + ataman.getName() + "\nNationality: " +
        // ataman.getNationality() + "\nDate of Birth: "
        // + ataman.getDateOfBirth() + "\nSeat Number: " + ataman.getSeatNumber());

        Car corsa = new Car("Opel", "White", 2023, 9000);
        Car corsa2 = new Car(corsa);
        corsa2.setBrand("Chevrolet");
        System.out.println(corsa.toString());
        System.out.println("New brand: \n");
        System.out.println(corsa2.toString());
    }
}
