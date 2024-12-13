import java.util.Arrays;

public class ArraysEdu {
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
        double[] afterTaxPrices = new double[prices.length];
        for (int i = 0; i < prices.length; i++) {
            afterTaxPrices[i] = prices[i] + prices[i] * 13 / 100;
        }
        System.out.println("After tax prices: ");
        for (int i = 0; i < afterTaxPrices.length; i++) {
            System.out.println(afterTaxPrices[i]);
        }

        System.out.println(Arrays.toString(afterTaxPrices));

        String[] record = { "WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS" };
        int wins = 0;
        int losses = 0;

        for (String item : record) {
            if (item.equalsIgnoreCase("win")) {
                wins++;
            } else if (item.equalsIgnoreCase("loss")) {
                losses++;
            } else {
                System.out.println("Wrong data. Check array");
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}