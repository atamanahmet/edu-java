public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.readFile().stream().forEach(line -> System.out.println(line));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        throw new NullPointerException();

    }
}
