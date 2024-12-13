public class ReturnValues {
    public static void main(String[] args) {
        double result = calculateArea(-2, 1.8);
        if (result != 0.0) {
            System.out.println(result);
            System.out.println(explainArea("english"));
        }

    }

    public static double calculateArea(double width, double height) {
        if (height < 0 || width < 0) {
            System.out.println("Values cannot be negative!");
            System.exit(0);
        }
        double area = width * height;
        return area;

    }

    public static String explainArea(String language) {
        switch (language) {
            case "english":
                return "Area equals length * height";
            case "french":
                return "La surface est egale a la longueur * la largeur";
            case "spanish":
                return "Area es igual a largo * ancho";
            default:
                return "no supported language selected";
        }

    }
}