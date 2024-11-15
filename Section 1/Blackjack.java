import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cards = cards();
        int userTotal = 0;
        int compTotal = 0;

        greet();
        scan.nextLine();
        userTotal = getCards(cards, userTotal, "Your");
        compTotal = getCards(cards, compTotal, "CPU");
        System.out.println("\nYour total: \n" + userTotal);
        System.out.println("\nCPU total: \n" + compTotal);

    }

    public static int getCards(String[] cards, int userTotal, String who) {
        if (who.equals("Your")) {
            String pickedCard = pickCard(cards);
            String pickedCard2 = pickCard(cards);
            System.out.println("\n" + who + " Hand: \n" + pickedCard + " " + pickedCard2);
            userTotal += calcPoints(pickedCard);
            userTotal += calcPoints(pickedCard2);

            return userTotal;
        } else {

            String pickedCard = pickCard(cards);
            String pickedCard2 = pickCard(cards);
            System.out.println("\n" + who + " Hand: \n" + pickedCard + " " +
                    pickedCard2);
            userTotal += calcPoints(pickedCard);
            userTotal += calcPoints(pickedCard2);

            return userTotal;
        }

    }

    public static int calcPoints(String pickedCard) {
        char value = pickedCard.charAt(11);
        int cardValue;
        if (value == 'A' ||
                value == 'J' ||
                value == 'K' ||
                value == 'Q') {
            cardValue = 10;
        } else {
            int number = value - '0';
            cardValue = number;
        }
        // System.out.println("Card value: " + cardValue);
        return cardValue;

    }

    public static String pickCard(String[] cards) {
        int randomNum = (int) (Math.random() * 13);
        return cards[randomNum];
    }

    public static String[] cards() {
        String ace = " _______\n |A _  |\n | ( ) |\n |(_'_)|\n | | | |\n |____V|\n";
        String two = " _______\n |2    |\n |  o  |\n |     |\n |  o  |\n |____Z|\n";
        String three = " _______\n |3    |\n | o o |\n |     |\n | o o |\n |____E|\n";
        String four = " _______\n |4    |\n | o o |\n |     |\n | o o |\n |____h|\n";
        String five = " _______\n |5    |\n | o o |\n |  o  |\n | o o |\n |____S|\n";
        String six = " _______\n |6    |\n | o o |\n | o o |\n | o o |\n |____6|\n";
        String seven = " _______\n |7    |\n | o o |\n |o o o|\n | o o |\n |____7|\n";
        String eight = " _______\n |8    |\n |o o o|\n | o o |\n |o o o|\n |____8|\n";
        String nine = " _______\n |9    |\n |o o o|\n |o o o|\n |o o o|\n |____9|\n";
        String ten = " _______\n |10  o|\n |o o o|\n |o o o|\n |o o o|\n |___10|\n";
        String jack = " _______\n |J www|\n | o {)|\n |o o% |\n | | % |\n |__%%[|\n";
        String queen = " _______\n |Q www|\n | o {(|\n |o o%%|\n | |%%%|\n |_%%%O|\n";
        String king = " _______\n |K WWW|\n | o {)|\n |o o%%|\n | |%%%|\n |_%%%>|\n";

        String[] cards = { ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king };
        return cards;
    }

    public static void greet() {
        System.out.println("\nBlackjack 0.1\nPress Enter to Draw card\n");
    }
}