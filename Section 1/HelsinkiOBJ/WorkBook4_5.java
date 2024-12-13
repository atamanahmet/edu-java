public class WorkBook4_5 {

    public static void main(String[] args) {
        printAreas();
    }

    public static void printAreas() {
        System.out.println("Area of the Square: " + areaSquare(2.3) + " unit");
        System.out.println("Area of the Rectangle: " + areaRectangle(2, 3) + " unit");
        System.out.println("Area of the Triangle: " + areaTriangle(2, 10) + " unit");
        System.out.println("Area of the Circle: " + areaCircle(10) + " unit");
    }

    /**
     * 
     * @param side (double)
     * @return area (double)
     *         Inside:
     *         check params negative or not.
     *         return area
     */
    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Calculation imposible. Exitting..");
            System.exit(1);
            return 0;
        } else {

            return Math.pow(side, 2);
        }

    }

    /**
     * 
     * @param width  (double)
     * @param height (double)
     * @return area of rectangle (double)
     * 
     *         Inside:
     *         check params negative or not.
     *         return area
     */
    public static double areaRectangle(double width, double height) {
        if (width < 0 || height < 0) {
            System.out.println("Calculation imposible. Exitting..");
            System.exit(1);
            return 0;
        } else {
            return height * width;
        }

    }

    /**
     * 
     * @param base   (double)
     * @param height (double)
     * @return area
     */
    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Error: Imposible");
            System.exit(1);
            return 0;
        } else {
            return base * (height / 2);
        }
    }

    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Error: Imposible");
            System.exit(1);
            return 0;
        } else {
            return Math.PI * radius;
        }
    }

}