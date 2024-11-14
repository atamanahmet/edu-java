import java.util.Scanner;

public class Pokerito {

    public static void main(String[] artgs) {
        Scanner scan = new Scanner(System.in);

        int[] riverArray = new int[5];

        String[] cards = { " _______\n |A _  |\n | ( ) |\n |(_'_)|\n | | | |\n |____V|\n",
                "   _____\n  |2    |\n  |  o  |\n  |     |\n  |  o  |\n  |____Z|\n",
                " _______\n |3    |\n | o o |\n |     |\n | o o |\n |____E|\n",
                " _______\n |4    |\n | o o |\n |     |\n | o o |\n |____h|\n",
                " _______ \n |5    |\n | o o |\n |  o  |\n | o o |\n |____S|\n",
                " _______\n |6    |\n | o o |\n | o o |\n | o o |\n |____6|\n",
                " _______\n |7    |\n | o o |\n |o o o|\n | o o |\n |____7|\n",
                " _______\n |8    |\n |o o o|\n | o o |\n |o o o|\n |____8|\n",
                " _______\n |9    |\n |o o o|\n |o o o|\n |o o o|\n |____9|\n",
                " _______\n |10  o|\n |o o o|\n |o o o|\n |o o o|\n |___10|\n",
                " _______\n |J www|\n | o {)|\n |o o% |\n | | % |\n |__%%[|\n",
                " _______\n |Q www|\n | o {(|\n |o o%%|\n | |%%%|\n |_%%%O|\n",
                " _______\n |K WWW|\n | o {)|\n |o o%%|\n | |%%%|\n |_%%%>|\n" };
        System.out.println("Press Enter to pick a card\n");
        scan.nextLine();
        int userCard = pickCard();
        int computerCard = pickCard();
        System.out.println("Your card:\n" + cards[userCard]);
        System.out.println("Computer's card:\n" + cards[computerCard]);
        System.out.println("Here comes the River..\nPress Enter to continue");
        scan.nextLine();
        pickFiveCards(riverArray);

        // for (int i = 0; i < riverArray.length; i++) {
        // System.out.println(riverArray[i]);
        // }
    }

    /**
     * @param cardIndex
     * @return cardIndex
     */

    public static int pickCard() {

        int cardIndex = (int) (Math.random() * 12) + 1;
        return cardIndex;
    }

    public static void pickFiveCards(int[] passArray) {
        for (int i = 0; i < 5; i++) {
            int cardIndex = (int) (Math.random() * 13) + 1;
            passArray[i] = cardIndex;
            // System.out.println(passArray[i]);

        }

    }

}

// 1:

// 2:

// 3:

// 4:

// 5:
;

// 6:
// " _______\n |6 |\n | o o |\n | o o |\n | o o |\n |____6|\n";

// 7:

// " _______\n |7 |\n | o o |\n |o o o|\n | o o |\n |____7|\n";

// 8:

// " _____ \n |8 |\n |o o o|\n | o o |\n |o o o|\n |____8|\n";

// 9:
// " _______\n |9 |\n |o o o|\n |o o o|\n |o o o|\n |____9|\n";

// 10:
// " _______\n |10 o|\n |o o o|\n |o o o|\n |o o o|\n |___10|\n";

// 11:

// " _______\n |J www|\n | o {)|\n |o o% |\n | | % |\n |__%%[|\n";

// 12:

// " _______\n |Q www|\n | o {(|\n |o o%%|\n | |%%%|\n |_%%%O|\n";

// 13:
// " _______\n |K WWW|\n | o {)|\n |o o%%|\n | |%%%|\n |_%%%>|\n";