import java.util.Scanner;
// import java.lang.StringBuilder;

public class Hangman {
    public static Scanner scan = new Scanner(System.in);
    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam",
            "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog",
            "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt",
            "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon",
            "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout",
            "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra" };
    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        boolean isWin = false;
        String word = randomWord(words);
        System.out.println(word);
        System.out.println(word.length());
        String hidden = "";

        for (int i = 0; i < word.length(); i++) {
            hidden += "_";

        }
        System.out.println(hidden);
        while (!isWin) {
            System.out.println(gallows[0]);
            System.out.println("Word: \t" + hidden);
            System.out.println(word);
            System.out.print("\nGuess: ");
            char guess = scan.nextLine().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (guess == word.charAt(i)) {
                    hidden = hidden.substring(0, i) + guess + hidden.substring(i + 1, word.length());
                }
            }
        }

    }

    public static String randomWord(String[] wordArray) {
        int randomNum = (int) (Math.random() * wordArray.length);
        return wordArray[randomNum];
    }

    public static char guess() {
        return 'a';
    }
}
