import java.util.Scanner;

public class Pokerito {

    public static void main(String[] artgs) {
        Scanner scan = new Scanner(System.in);
        String[] cards = cards();

        System.out.println("Press Enter to pick a card\n");
        scan.nextLine();

        String userCard = cards[pickCard()];
        String computerCard = cards[pickCard()];

        System.out.println("Your card:\n" + userCard);
        System.out.println("Computer's card:\n" + computerCard);
        System.out.println("Here comes the River..\nPress Enter to continue");
        scan.nextLine();

        String[] river = pickFiveCards(cards, scan);

        scan.close();
        isWin(river, userCard, computerCard);

    }

    /**
     * @param cardIndex
     * @return cardIndex
     *         Inside
     *         generate a random number between 0 and 12 for cards array
     */

    public static int pickCard() {

        int cardIndex = (int) (Math.random() * 13);

        return cardIndex;
    }

    /**
     * 
     * @param riverArray
     * @param player
     * @param cpu
     *                   Inside
     *                   compare river to player card and cpu card
     *                   add points if true
     *                   check who win
     *                   write who win
     */
    public static void isWin(String[] riverArray, String player, String cpu) {
        int playerScore = 0;
        int cpuScore = 0;
        for (int i = 0; i < riverArray.length; i++) {
            if (riverArray[i].equals(player)) {
                playerScore++;
            }
            if (riverArray[i].equals(cpu)) {
                cpuScore++;
            }
        }

        System.out.println("Your Match Score: " + playerScore);
        System.out.println("CPU Match Score: " + cpuScore);

        if (playerScore == cpuScore) {
            System.out.println("Draw! Try again.");
        } else if (playerScore > cpuScore) {
            System.out.println("You Win!!!");
        } else if (playerScore < cpuScore) {
            System.out.println("You Lost...");
        }

    }

    /**
     * 
     * @param cardArray
     * @param scan
     * @return river
     *         Inside
     *         pick random 5 card from cards array
     */
    public static String[] pickFiveCards(String[] cardArray, Scanner scan) {
        String[] river = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter to Draw");
            scan.nextLine();
            int cardIndex = (int) (Math.random() * 13);
            river[i] = cardArray[cardIndex];
            System.out.print("Card " + (i + 1) + ":\n" + river[i] + "\n");

        }
        return river;

    }

    public static String[] cards() {

        String[] cards = { " _______\n |A _  |\n | ( ) |\n |(_'_)|\n | | | |\n |____V|\n",
                "   _____\n |2    |\n |  o  |\n |     |\n |  o  |\n |____Z|\n",
                " _______\n |3    |\n | o o |\n |     |\n | o o |\n |____E|\n",
                " _______\n |4    |\n | o o |\n |     |\n | o o |\n |____h|\n",
                " _______\n |5    |\n | o o |\n |  o  |\n | o o |\n |____S|\n",
                " _______\n |6    |\n | o o |\n | o o |\n | o o |\n |____6|\n",
                " _______\n |7    |\n | o o |\n |o o o|\n | o o |\n |____7|\n",
                " _______\n |8    |\n |o o o|\n | o o |\n |o o o|\n |____8|\n",
                " _______\n |9    |\n |o o o|\n |o o o|\n |o o o|\n |____9|\n",
                " _______\n |10  o|\n |o o o|\n |o o o|\n |o o o|\n |___10|\n",
                " _______\n |J www|\n | o {)|\n |o o% |\n | | % |\n |__%%[|\n",
                " _______\n |Q www|\n | o {(|\n |o o%%|\n | |%%%|\n |_%%%O|\n",
                " _______\n |K WWW|\n | o {)|\n |o o%%|\n | |%%%|\n |_%%%>|\n" };
        return cards;
    }

}

// 1:" _______\n |A _ |\n | ( ) |\n |(_'_)|\n | | | |\n |____V|\n"

// 2:" _____\n |2 |\n | o |\n | |\n | o |\n |____Z|\n"

// 3:" _______\n |3 |\n | o o |\n | |\n | o o |\n |____E|\n"

// 4:" _______\n |4 |\n | o o |\n | |\n | o o |\n |____h|\n"

// 5:" _______ \n |5 |\n | o o |\n | o |\n | o o |\n |____S|\n"

// 6:
// " _______\n |6 |\n | o o |\n | o o |\n | o o |\n |____6|\n"

// 7:

// " _______\n |7 |\n | o o |\n |o o o|\n | o o |\n |____7|\n"

// 8:

// " _____ \n |8 |\n |o o o|\n | o o |\n |o o o|\n |____8|\n"

// 9:
// " _______\n |9 |\n |o o o|\n |o o o|\n |o o o|\n |____9|\n"

// 10:
// " _______\n |10 o|\n |o o o|\n |o o o|\n |o o o|\n |___10|\n"

// 11:

// " _______\n |J www|\n | o {)|\n |o o% |\n | | % |\n |__%%[|\n"

// 12:

// " _______\n |Q www|\n | o {(|\n |o o%%|\n | |%%%|\n |_%%%O|\n"

// 13:
// " _______\n |K WWW|\n | o {)|\n |o o%%|\n | |%%%|\n |_%%%>|\n"