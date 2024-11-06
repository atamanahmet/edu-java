public class Variables {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;
        double price = 0.40;

        System.out.println("Apple count: " + (numOfApples += 500));
        System.out.println("bought1: " + (numOfApples -= 4));
        numOfCustomers++;

        profit += (4 * price);
        System.out.println("bought2:" + (profit += (20 * price)));

        numOfCustomers++;
        numOfApples -= 20;
        System.out.println("bought3: " + (profit += 200 * price));
        numOfCustomers++;
        numOfApples -= 200;

        System.out.println("profit: " + profit + "$ remainder: " + numOfApples + " customer count : " + numOfCustomers);

    }
}