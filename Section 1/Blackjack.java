import java.util.Scanner;

public class Blackjack {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] cards = cards();
        int userTotal = 0;
        int compTotal = 0;
        boolean isEnd = false;

        System.out.println("\nBlackjack 0.1\nPress Enter to Draw card\n");
        scan.nextLine();

        String userCard = pickCard(cards);
        String userCard2 = pickCard(cards);
        System.out.println("\nYour Hand: \n" + userCard + userCard2);
        userTotal += calcPoints(userCard) + calcPoints(userCard2);
        String compCard = pickCard(cards);
        String compCard2 = pickCard(cards);
        System.out.println("\nCPU Hand: \n" + compCard +
                cards[13]);
        compTotal += calcPoints(compCard) + calcPoints(compCard2);

        System.out.println("Your total: " + userTotal);
        while (!isEnd) {

            System.out.println("\nHit or Stay?");
            String selection = scan.nextLine();

            if (selection.toLowerCase().equals("hit")) {
                String newCard = pickCard(cards);
                System.out.println("You draw:\n" + userCard);
                userTotal += calcPoints(newCard);
                System.out.println("Your total: " + userTotal);

            } else if (selection.toLowerCase().equals("stay")) {
                while (compTotal < 17) {
                    System.out.println("\nDealer's draw\nPress Enter to continue");
                    scan.nextLine();
                    String newCard = pickCard(cards);
                    System.out.println("\nDealer gets a: \n" + newCard + "\nDealer's deck is :\n" + compCard + compCard2
                            + newCard);
                    compTotal += calcPoints(newCard);
                }
                isEnd = true;
            }
            if (userTotal >= 21) {
                isEnd = true;
            }
        }
        scan.close();
        System.out.println("\nGame Over!");
        System.out.println("\nYour total: " + userTotal);
        System.out.println("CPU total: " + compTotal);
        if (userTotal == compTotal && userTotal < 22 && compTotal < 22) {
            System.out.println("\n Draw!");
            System.exit(0);
        } else if ((userTotal > compTotal && userTotal < 22) || (compTotal > 21 && userTotal <= 21)) {
            System.out.println("\nYou Win!");
            System.exit(0);
        }

        else if (compTotal > userTotal && compTotal < 22 || userTotal > 21 && compTotal <= 21) {
            System.out.println("\nBust!\nYou Lost...");
            System.exit(0);
        }
    }

    public static int getFirstCards(String[] cards, int totalPoint, String compSecondCard, String who) {
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

}