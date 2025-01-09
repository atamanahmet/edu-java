import java.util.Random;

public class test {
    public static void main(String[] args) {
        // TestObject<Integer> testInteger = new TestObject<Integer>(15);
        // TestObject<String> testString = new TestObject<String>("some string");
        // int num = 123;
        // Integer num2 = Integer.valueOf(num);

        // System.out.println(testInteger);
        // System.out.println(testString);
        // System.out.println(testInteger.getClass());
        // System.out.println(testInteger instanceof TestObject);
        // System.out.println(num2.getClass());
        Locker<Random> randomLocker = new Locker<>();
        // randomLocker.setValue(new Random());
        // System.out.println(randomLocker.getValue().nextDouble);
        randomLocker.setvalue(new Random());
        System.out.println(randomLocker.getvalue().nextDouble());
    }
}
