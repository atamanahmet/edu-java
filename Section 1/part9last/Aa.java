import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Aa {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // while (true) {
        // System.out.println("Enter chars");
        // String input = scanner.nextLine();
        // if (input.equals("")) {
        // break;
        // }
        // list.add(input);
        // }
        // // List<Integer> ordered = list.stream().mapToInt(row ->
        // Integer.valueOf(row));
        // long counter = list.stream().mapToInt(row ->
        // Integer.valueOf(row)).filter(number -> number % 3 == 0).count();
        // // List<Integer> numbersBy3 = list.stream().mapToInt(row ->
        // // Integer.valueOf(row));
        // System.out.println(counter);
        // double average = list.stream().mapToInt(line ->
        // Integer.valueOf(line)).average().getAsDouble();
        // System.out.println(average);
        // List<String> numberList = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Input numbers, type 'end' to stop.");
        // while (true) {
        // String input = scanner.nextLine();
        // if (input.equals("end")) {
        // break;
        // } else if (input.equals("")) {
        // continue;
        // }
        // numberList.add(input);
        // }
        // double average = numberList.stream().mapToInt(line ->
        // Integer.valueOf(line)).average().getAsDouble();
        // System.out.println("average of the numbers: " + average);
        // Scanner scanner = new Scanner(System.in);
        // List<String> list = new ArrayList<>();
        // System.out.println("Input numbers, type 'end' to stop.");
        // while (true) {
        // String input = scanner.nextLine();
        // if (input.equals("")) {
        // continue;
        // } else if (input.equals("end")) {
        // break;
        // }
        // list.add(input);
        // }
        // System.out.println("Print the average of the negative numbers or the positive
        // numbers? (n/p)");
        // String selection = scanner.nextLine();
        // int counter = 0;
        // while (true) {
        // if (counter != 0) {
        // System.out.println("Print the average of the negative numbers or the positive
        // numbers? (n/p)");
        // }

        // if (selection.equals("n")) {
        // double average = list
        // .stream()
        // .mapToInt(line -> Integer.valueOf(line))
        // .filter(number -> number < 0)
        // .average().getAsDouble();
        // System.out.println("Average of the negative numbers:" + average);
        // break;
        // } else if (selection.equals("p")) {
        // double average = list
        // .stream()
        // .mapToInt(line -> Integer.valueOf(line))
        // .filter(number -> number > 0)
        // .average()
        // .getAsDouble();
        // System.out.println("Average of the positive numbers:" + average);

        // break;
        // } else {
        // continue;
        // }
        // }
        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(3);
        // numbers.add(2);
        // numbers.add(-17);
        // numbers.add(-5);
        // numbers.add(7);

        // ArrayList<Integer> divisible = divisible(numbers);

        // divisible.stream()
        // .forEach(num -> System.out.println(num));

        // }

        // public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        // ArrayList<Integer> list = numbers.stream().filter(number -> number % 2 ==
        // 0).boxed()
        // .collect(Collectors.toCollection(ArrayList::new));
        // return list;
        // }

        // public static List<Integer> positive(List<Integer> numbers) {
        // // List<Integer> list = new ArrayList<>();
        // return numbers.stream().mapToInt(line -> Integer.valueOf(line)).filter(number
        // -> number > 0).boxed()
        // .collect(Collectors.toCollection(ArrayList::new));

        // }

        // Person person1 = new Person("csdasd", "hjkhjk", 1962);
        // Person person4 = new Person("Asdasd", "hjkhjk", 1962);
        // Person person6 = new Person("Asdasd", "hjkhjk", 1962);
        // Person person2 = new Person("zxczxc", "yuıyuı", 1960);
        // Person person5 = new Person("zxczxc", "yuıyuı", 1960);
        // Person person3 = new Person("qweqwe", "lşklşl", 1985);

        // list.add(person1);
        // list.add(person2);
        // list.add(person3);
        // list.add(person4);
        // list.add(person5);
        // list.add(person6);

        // long count = list.stream().filter(person -> person.getBirthYear() <
        // 1970).count();
        // System.out.println(count);
        // long nameCount = list.stream().filter(person ->
        // person.getFirstName().toLowerCase().startsWith("a")).count();
        // System.out.println(nameCount);
        // // ArrayList<Person> namesInOrder = list.stream().distinct().sorted()
        // // .collect(Collectors.toCollection(ArrayList::new));
        // // list.stream().distinct().sorted().forEach(person ->
        // // System.out.println(person));
        // ArrayList<String> ordered = list.stream().map(person ->
        // person.getFirstName()).distinct().sorted()
        // .collect(Collectors.toCollection(ArrayList::new));
        // ordered.stream().forEach(name -> System.out.println(name));
        // ArrayList<String> inputList = new ArrayList<>();
        // while (true) {
        // String input = scanner.nextLine();
        // if (input.equals("")) {
        // break;
        // }
        // inputList.add(input);
        // }
        // inputList.stream().forEach(line -> System.out.println(line));
        ArrayList<Integer> numberList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            numberList.add(Integer.valueOf(input));
        }
        numberList.stream().mapToInt(line -> Integer.valueOf(line)).filter(number -> number >= 1 && number <= 5)
                .forEach(number -> System.out.println(number));
    }

}
