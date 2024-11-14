public class Pokerito {

    public static void main(String[] artgs) {
        System.out.println(pickCard());
    }

    public static String pickCard() {
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
        int cardIndex = (int) (Math.random() * 13) + 1;
        return cards[cardIndex];
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