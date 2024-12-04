
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                int number = Integer.valueOf(fileScan.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Numbers: " + counter);

    }

}

// import java.nio.file.Paths;
// import java.util.ArrayList;
// import java.util.Scanner;

// public class StoringRecords {

// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);

// System.out.println("Filename:");
// String file = scan.nextLine();

// ArrayList<Person> records = readRecordsFromFile(file);
// System.out.println("Persons: " + records.size());
// System.out.println("Persons:");
// for (Person person : records) {
// System.out.println(person);

// }
// }

// public static ArrayList<Person> readRecordsFromFile(String file) {
// ArrayList<Person> persons = new ArrayList<>();
// try (Scanner fileScan = new Scanner(Paths.get("data.txt"))) {
// while (fileScan.hasNextLine()) {
// String row = fileScan.nextLine();
// String[] bufferArray = row.split(",");
// persons.add(new Person(bufferArray[0], Integer.valueOf(bufferArray[1])));
// }
// } catch (Exception e) {
// System.out.println(e.getMessage());
// }
// // Write here the code for reading from file
// // and printing the read records
// return persons;

// }
// }

// Scanner scan = new Scanner(System.in);
// System.out.println("File:");
// String file = scan.nextLine();
// System.out.println("Team:");
// String team = scan.nextLine();
// int games = 0;
// int wins=0;
// int loss=0;
// try(Scanner fileScan = new Scanner(Paths.get(file))){
// while(fileScan.hasNextLine()){
// String[] buffer = fileScan.nextLine().split(",");
// if(buffer[0].equals(team)||buffer[1].equals(team)){
// games++;
// }
// if(buffer[0].equals(team)){
// if(Integer.valueOf(buffer[2])>Integer.valueOf(buffer[3])){
// wins++;
// }
// else{
// loss++;
// }
// }
// else if (buffer[1].equals(team)){
// if(Integer.valueOf(buffer[3])>Integer.valueOf(buffer[2])){
// wins++;
// }
// else{
// loss++;
// }
// }
// }
// System.out.println("Games: "+games);
// System.out.println("Wins: "+wins);
// System.out.println("Losses: "+loss);
// }
// catch(Exception e){
// System.out.println(e.getMessage());
// }
