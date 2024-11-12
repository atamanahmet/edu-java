
public class BuiltInFunctions {
    public static void main(String[] args) {
        // String a = "Test 123 Test";

        // System.out.println(a.startsWith("t"));
        // String b = "Deneme Deneme";
        // b = b.replaceAll("e", "d");
        // System.out.println(b);

        // double c = 71;
        // double sqrtC = Math.sqrt(c);
        // System.out.println(sqrtC);

        // double base = 2;
        // double exponent = 3;
        // double result = Math.pow(base, exponent);
        // System.out.println(result);

        // between 0 and 100
        double random = Math.floor((Math.random() * 100) + 1);

        System.out.println(random);

        int min = 10;
        int max = 100;
        System.out.println(Math.min(min, max));

    }
}