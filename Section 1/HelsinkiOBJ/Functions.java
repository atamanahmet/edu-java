public class Functions {
    public static void main(String[] args) {
        double receit = 53.50;
        // int a = 3;
        // String b = "asdasd";
        // printLines(a, 3);
        calcTip(receit);
    }

    public static void calcTip(double bill) {
        double tip = bill * 15 / 100;
        System.out.println("Your tip amount is : $" + tip);
    }
    // public static void printLines(double a, double b) {
    // System.out.println("result : " + a * b);
    // // System.out.println("I will not copy and paste code.");
    // // System.out.println("I will use Camel Case when writing class names.");
    // // System.out.println("I will use lower Camel Case when writing function
    // // names.");
    // // System.out.println("I will use lower Camel Case when writing variables
    // // names.");

    // }
}