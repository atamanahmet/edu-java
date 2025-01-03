import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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
        // List<Person> list = new ArrayList<>();
        // Person anna = new Person("Anna", Education.PHD);
        // Person anna1 = new Person("qAnna1", Education.BA);
        // Person anna2 = new Person("Anna2", Education.PHD);
        // Person anna3 = new Person("xAnna3", Education.BA);
        // Person anna4 = new Person("Anna4", Education.PHD);
        // Person anna5 = new Person("Anna5", Education.PHD);
        // Person anna6 = new Person("cAnna6", Education.BA);
        // list.add(anna);
        // list.add(anna1);
        // list.add(anna2);
        // list.add(anna3);
        // list.add(anna4);
        // list.add(anna5);
        // list.add(anna6);
        // Employees emp = new Employees();
        // emp.add(list);
        // emp.print();
        // System.out.println("----------------");
        // emp.fire(Education.BA);
        // emp.print();
        // Employees university = new Employees();
        // university.add(new Person("Petrus", Education.PHD));
        // university.add(new Person("Arto", Education.HS));
        // university.add(new Person("Elina", Education.PHD));

        // university.print();

        // university.fire(Education.HS);

        // System.out.println("==");

        // university.print();
        List<Card> cardList = new ArrayList<>();
        Card first = new Card(2, Suit.DIAMOND);
        Card first2 = new Card(9, Suit.DIAMOND);
        Card first3 = new Card(4, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);
        cardList.add(first);
        cardList.add(first2);
        cardList.add(first3);
        cardList.add(second);
        cardList.add(third);

        // System.out.println(first.getValue());
        // System.out.println(second);
        // System.out.println(third);
        // System.out.println(first.compareTo(second));
        System.out.println(cardList);
        cardList.sort((p1, p2) -> p1.compareTo(p2));

        // cardList.sort(Comparator.comparing(Card::getValue).thenComparing(Card::getSuit));
        System.out.println(cardList);
        // cardList.stream().forEach(card -> System.out.println(card));
        // Iterator<Card> it = cardList.iterator();
        // while (it.hasNext()){

        // }

    }
}
