public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 14775, 7928, 27102, 21787, 21063, 38096, 42711, 32863, 23707, 48328, 555888 };
        int biggestNumber = 0;
        int biggestNumberLocation = -1;
        for (int i = 0; i < numbers.length; i++) {

            if (biggestNumber < numbers[i]) {
                biggestNumber = numbers[i];
                biggestNumberLocation = i;
            }

        }
        System.out.println("Biggest Number: " + biggestNumber);
        System.out.println("On index of: " + biggestNumberLocation);
        String[] apples = { "Gala", "Grabby Smith", "Macintosh" };
        double[] prices = { 1.99, 1.49, 1.29 };
        for (int i = 0; i < apples.length; i++) {

            System.out.println("\t" + apples[i] + ": " + prices[i]);

        }

    }
}