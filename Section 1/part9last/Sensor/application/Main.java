public class Main {
    public static void main(String[] args) {
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new StandardSensor(4));
        System.out.println(ka.read());
    }
}
