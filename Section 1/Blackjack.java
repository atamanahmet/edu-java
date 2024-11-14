import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cards = cards();
        greet();
        scan.nextLine();
        System.out.println(pickCard(cards));
    }

    public static String pickCard(String[] cards) {
        int randomNum = (int) (Math.random() * 13);
        return cards[randomNum];
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

    public static void greet() {
        System.out.println("Blackjack 0.1\nPress Enter to Draw card\n");
    }
}