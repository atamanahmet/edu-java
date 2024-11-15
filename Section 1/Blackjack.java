import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cards = cards();
        int userTotal = 0;
        int compTotal = 0;
        String compSecondCard = "";
        boolean end = false;

        greet();
        scan.nextLine();
        userTotal = getCards(cards, userTotal, compSecondCard, "Your");
        compTotal = getCards(cards, compTotal, compSecondCard, "CPU");
        System.out.println("\nYour total: \n" + userTotal);
        if (!end) {
            System.out.println("\nCPU total: Hidden");
        } else {
            System.out.println("\nCPU total: \n" + compTotal);
        }
        System.out.println("Hit or Stay?");

    }

    public static int getCards(String[] cards, int totalPoint, String compSecondCard, String who) {
        if (who.equals("Your")) {
            String pickedCard = pickCard(cards);
            String pickedCard2 = pickCard(cards);
            System.out.println("\n" + who + " Hand: \n" + pickedCard + pickedCard2);
            totalPoint += calcPoints(pickedCard);
            totalPoint += calcPoints(pickedCard2);

            return totalPoint;
        } else {

            String pickedCard = pickCard(cards);
            String pickedCard2 = pickCard(cards);
            compSecondCard = pickedCard2;
            System.out.println("\n" + who + " Hand: \n" + pickedCard +
                    cards[13]);
            totalPoint += calcPoints(pickedCard);
            totalPoint += calcPoints(pickedCard2);

            return totalPoint;
        }

    }

    public static int calcPoints(String pickedCard) {
        char value = pickedCard.charAt(11);
        int cardValue;
        if (value == 'A' ||
                value == 'J' ||
                value == 'K'
                || value == 'Q') {
            cardValue = 10;
        } else {
            int number = value - '0';
            if (number == 1) {
                cardValue = 10;
            } else {
                cardValue = number;
            }

        }

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
        String empty = " _______\n |     |\n | * * |\n |  *  |\n | * * |\n |_____|\n";
        String[] cards = { ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, empty };
        return cards;
    }

    public static void greet() {
        System.out.println("\nBlackjack 0.1\nPress Enter to Draw card\n");
    }
}