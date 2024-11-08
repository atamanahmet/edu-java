public class Converter {
    public static void main(String[] args) {
        double[] fahrenheit = { 77, 61, 55 };
        // double fahrenheit = 61;
        printResult(fahrenheit);

    }

    /**
     * Funtion name: printText
     * 
     * @param fahrenheit (double)
     * @return (double)
     * 
     *         1.Converts fahrenheit data to celcius
     */
    public static double converter(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void printResult(double[] fahrenheit) {
        for (double degree : fahrenheit) {
            double celcius = converter(degree);
            System.out.println("\nFahrenheit : " + degree + "°");
            System.out.println("To Celcius : " + celcius + "°");
        }

    }
}