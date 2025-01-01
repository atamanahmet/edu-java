import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aaa {
    public static void main(String[] args) {
        // List<String[]> list = new ArrayList<>();
        // List<String[]> listBuffer = new ArrayList<>();

        // try {
        // Files.lines(Paths.get("literacy.csv")).map(line -> line.split(","))
        // .map(arr -> new String[] { arr[0], arr[1], arr[2] }).forEach(arr ->
        // list.add(arr));

        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }
        // list.stream().forEach(arr -> System.out.println(arr[0] + ", " + arr[1] + ", "
        // + arr[2]));
        // Scanner scanner = new Scanner(System.in);
        // List<String[]> books = new ArrayList<>();
        // while (true) {
        // System.out.print("Input the name of the book, empty stops: ");
        // String name = scanner.nextLine();
        // if (name.equals("")) {
        // break;
        // }
        // System.out.print("Input the age recommendation: ");
        // String ageReq = scanner.nextLine();
        // books.add(new String[] { name, ageReq });
        // }
        // Comparator<String[]> comp =
        // Comparator.comparing(String[]::String[].ageReq).thenComparing(Book::getName);
        // Collections.sort(books, comp);
        // System.out.println();
        // System.out.println(books.size() + " books in total.");
        // System.out.println();
        // books.stream().forEach(book -> System.out.println(book));

        // }

        // public int getAgeReq(){
        // return Integer.valueOf(this[1].);
        // }
        // String name = "asdasd";
        // String name2 = "asdasd";
        // String name3 = "zxczxc";
        // name2 = "qweqwe";

        // System.out.println(name);i
        // Pattern pattern = Pattern.compile("^(\\d{4})-(\\d{4})-(\\d{4})-(\\d{4})");
        // Matcher matcher = pattern.matcher("1234-1111-1243-4444");
        // boolean found = matcher.find();
        // System.out.println("Found? = " + found);

        // begin with 1 or more digit number, , any number of char, , any number of
        // digit
        // Pattern pattern = Pattern.compile("^(\\d+) (.+) by (\\d+)$");
        // Matcher matcher = pattern.matcher("10 divided by 2");
        // boolean found = matcher.find();
        // System.out.println("Found? = " + found);
        // int result = 0;

        // if (found) {
        // // String key = matcher.group(0);
        // // String maskedNumbers = new String(matcher.replaceAll("XXXX-XXXX-XXXX-" +
        // // matcher.group(4)));
        // // matcher.reset();
        // // System.out.println(key);
        // // System.out.println(maskedNumbers);
        // // System.out.println(maskedNumbers);
        // System.out.println(matcher.group(0));
        // System.out.println(matcher.group(1));
        // System.out.println(matcher.group(2));
        // System.out.println(matcher.group(3));
        // if (matcher.group(2).equals("divided")) {
        // result = Integer.valueOf(matcher.group(1)) /
        // Integer.valueOf(matcher.group(3));
        // }
        // System.out.println(matcher.group(1) + " " + matcher.group(2) + " by " +
        // matcher.group(3) + " = " + result);
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your student number: ");
        // String input = scanner.nextLine();

        // if (input.matches("01\\d{7}")) {
        // System.out.println("Correct format.");
        // } else {
        // System.out.println("Incorrect format. Try again.");
        // }
        // String string = "trolololololo";

        // if (string.matches("(lo)?tro(lo){5}+")) {
        // System.out.println("Correct form.");
        // } else {
        // System.out.println("Incorrect form.");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the day with only first three characters: ");
        // String input = scanner.nextLine();

        // Checker checker = new Checker();
        // // if (checker.isDayOfWeek(input)) {
        // // System.out.println("The form is correct.");
        // // } else {
        // // System.out.println("The form is incorrect.");
        // // }

        // // if (checker.allVowels(input)) {
        // // System.out.println("The form is correct.");
        // // } else {
        // // System.out.println("The form is incorrect.");
        // // }
        // if (checker.timeOfDay(input)) {
        // System.out.println("The form is correct.");
        // } else {
        // System.out.println("The form is incorrect.");
        // }
        // Card card = new Card(7, Suit.SPADE);
        // System.out.println(card);
        // System.out.println(card.getSuit());
        // System.out.println(Suit.SPADE);
        // Suit suitSpade = Suit.SPADE;
        // String suit = Suit.HEART.getName();
        // System.out.println(suit);
        // // Suit.HEART.setName("test");
        // System.out.println(Suit.HEART.getName());
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);
    }
}
