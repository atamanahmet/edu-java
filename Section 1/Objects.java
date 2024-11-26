import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {
        // CarObject car1 = new CarObject();
        // CarObject car2 = new CarObject();
        // System.out.println(car1.brand);
        // car1.brand = "Opel";
        // System.out.println(car1.brand);
        // car2.brand = "Corsa";
        // car2.year = 2023;
        // // System.out.println(String.valueOf(car2));
        // System.out.println(car2.brand + " " + car2.year);
        // car1.drive();
        Person ataman = new Person();
        ataman.name = "ahmet";
        ataman.nationality = "Turkey";
        ataman.dateOfBirth = "1992";
        ataman.passport = new String[] { ataman.name, ataman.nationality, ataman.dateOfBirth };
        ataman.seatNumber = 18;
        // System.out.println(Arrays.toString(ataman.passport));
        System.out.println(ataman.name);
        System.out.println(ataman.nationality);
        System.out.println(ataman.dateOfBirth);
        System.out.println(Arrays.toString(ataman.passport));
        System.out.println(ataman.seatNumber);

    }
}
