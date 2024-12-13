import java.util.Scanner;
// import java.util.Arrays;

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

            System.out.print("\t -Name: ");
            db[i][0] = scan.nextLine();

            System.out.print("\t -Date of Birth: ");
            db[i][1] = scan.nextLine();

            System.out.print("\t -Occupation: ");
            db[i][2] = scan.nextLine();
            System.out.println("");
        }

        System.out.println("Your entries: ");
        for (String[] entry : db) {
            System.out.print(entry[0] + " " + entry[1] + " " + entry[2] + "\n");
        }
    }

}
