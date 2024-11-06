import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello what is your name (like i care)?");
        String name = scan.nextLine();
        System.out.println("\nHi(!) " + name + ". I'm gddmn bot. Where are you from?");
        String city = scan.nextLine();
        System.out
                .println("\nHow nice. " + city + " is a great village i heard." + "\n\nHow old are you? (pls 18+...)");
        int age = scan.nextInt();
        scan.nextLine();
        if (age >= 18) {
            System.out.println("\nHow nice how nice. how.nice.." + "\n\nWhat is your fav language?");
        } else {
            System.out.println("\nJust fuck out of here pls." + "\n\tbb");
        }

        String language = scan.nextLine();

        if (language == "english" || language == "English" || language == "italian" || language == "japanese"
                || language == "Italian" || language == "Japanese") {
            System.out.println("Oo just an idiot sandwich.. " + language
                    + ".. How original. \n\nI mean programming language dufus?");
            language = scan.nextLine();
        } else {
            System.out.println("\noke im tired go away. Here's your collected info. You do you. \n\tName: " + name
                    + "\n\tCity: " + city + "\n\tAge: " + age + "\n\tFav Language: " + language);
        }
        scan.close();
    }
}