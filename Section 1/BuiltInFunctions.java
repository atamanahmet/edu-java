
public class BuiltInFunctions {
    public static void main(String[] args) {
        String a = "Test 123 Test";

        System.out.println(a.startsWith("t"));
        String b = "Deneme Deneme";
        b = b.replaceAll("e", "d");
        System.out.println(b);

        int c = 71;
        double d = Math.sqrt(c);
        System.out.println(d);
    }
}