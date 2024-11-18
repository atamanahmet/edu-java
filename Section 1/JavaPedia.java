import java.util.Scanner;
import java.util.Arrays;

public class JavaPedia {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many entry will you register?");
        int entryCount = (int) scan.nextInt();
        scan.nextLine();
        String[][] db = new String[entryCount][3];
        getEntries(db);
        printEntry(db);
    }

    public static void printEntry(String[][] db) {
        System.out.println("\nWho do you want information on?");
        String selection = scan.nextLine();
        for (int i = 0; i < db.length; i++) {
            if (selection.equalsIgnoreCase(db[i][0])) {
                System.out.println("\n\t " + db[i][0].toUpperCase() + ":" + "\n");
                System.out.print("\t-Name: " + db[i][0] + "\n");

                System.out.print("\t-Date of Birth: " + db[i][1] + "\n");

                System.out.print("\t-Occupation: " + db[i][2] + "\n");

            }

        }
        scan.close();
    }

    public static void getEntries(String[][] db) {

        for (int i = 0; i < db.length; i++) {
            System.out.println("\n\tFigure " + (i + 1) + "\n");
            for (int j = 0; j < db[i].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("\t -Name: ");
                        db[i][j] = scan.nextLine();
                        break;
                    case 1:
                        System.out.print("\t -Date of Birth: ");
                        db[i][j] = scan.nextLine();
                        break;
                    case 2:
                        System.out.print("\t -Occupation: ");
                        db[i][j] = scan.nextLine();
                        System.out.println("");

                        break;

                }

            }

        }
        System.out.println("Your entries: ");
        for (String[] strings : db) {
            System.out.print(strings[0] + " " + strings[1] + " " + strings[2]);
        }

    }
}
