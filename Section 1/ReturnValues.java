public class ReturnValues {
    public static void main(String[] args) {
        double result = calculateArea(2, 1.8);
        System.out.println(result);
    }

    public static double calculateArea(double width, double height) {
        double area = width * height;
        return area;
    }
}