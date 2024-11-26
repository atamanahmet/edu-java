public class Objects {
    public static void main(String[] args) {
        CarObject car1 = new CarObject();
        CarObject car2 = new CarObject();
        System.out.println(car1.brand);
        car1.brand = "Opel";
        System.out.println(car1.brand);
        car2.brand = "Corsa";
        car2.year = 2023;
        // System.out.println(String.valueOf(car2));
        System.out.println(car2.brand + " " + car2.year);
        car1.drive();
    }
}
