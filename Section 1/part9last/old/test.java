public class test {
    public static void main(String[] args) {
        TestObject testInteger = new TestObject<Integer>(15);
        TestObject testString = new TestObject<String>("some string");
        int num = 123;
        Integer num2 = Integer.valueOf(num);

        System.out.println(testInteger);
        System.out.println(testInteger.getClass());
        System.out.println(testInteger instanceof TestObject);
        System.out.println(num2.getClass());
    }
}
