import java.util.Scanner;
// import java.util.ArrayList;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    BirdManager birdManager = new BirdManager();

    public UserInterface() {

    }

    public void getInput() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                birdManager.add(name, latinName);
            } else if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String birdSearch = scanner.nextLine();
                birdManager.observation(birdSearch);
            } else if (input.equals("All")) {
                birdManager.printBirds();
            } else if (input.equals("One")) {

            }
        }
    }
}
