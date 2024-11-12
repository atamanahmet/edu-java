public class WorkBook4_5 {

    public static void main(String[] args) {
        System.out.println(areaSquare(3));
    }

    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Calculation imposible");
            System.exit(1);
            return 0;
        } else {

            return Math.pow(side, 2);
        }

    }

    public static double areaRectangle(double width, double height) {
        return height * width;
    }

}