
// // import java.nio.file.Paths;
// // import java.util.Scanner;

// // public class NumbersFromAFile {

// // public static void main(String[] args) {
// // Scanner scanner = new Scanner(System.in);

// // System.out.print("File? ");
// // String file = scanner.nextLine();
// // System.out.print("Lower bound? ");
// // int lowerBound = Integer.valueOf(scanner.nextLine());
// // System.out.print("Upper bound? ");
// // int upperBound = Integer.valueOf(scanner.nextLine());
// // int counter = 0;
// // try (Scanner fileScan = new Scanner(Paths.get(file))) {
// // while (fileScan.hasNextLine()) {
// // int number = Integer.valueOf(fileScan.nextLine());
// // if (number >= lowerBound && number <= upperBound) {
// // counter++;
// // }
// // }
// // } catch (Exception e) {
// // System.out.println(e.getMessage());
// // }
// // System.out.println("Numbers: " + counter);

// // }

// // }

// // // import java.nio.file.Paths;
// // // import java.util.ArrayList;
// // // import java.util.Scanner;

// // // public class StoringRecords {

// // // public static void main(String[] args) {
// // // Scanner scan = new Scanner(System.in);

// // // System.out.println("Filename:");
// // // String file = scan.nextLine();

// // // ArrayList<Person> records = readRecordsFromFile(file);
// // // System.out.println("Persons: " + records.size());
// // // System.out.println("Persons:");
// // // for (Person person : records) {
// // // System.out.println(person);

// // // }
// // // }

// // // public static ArrayList<Person> readRecordsFromFile(String file) {
// // // ArrayList<Person> persons = new ArrayList<>();
// // // try (Scanner fileScan = new Scanner(Paths.get("data.txt"))) {
// // // while (fileScan.hasNextLine()) {
// // // String row = fileScan.nextLine();
// // // String[] bufferArray = row.split(",");
// // // persons.add(new Person(bufferArray[0],
// Integer.valueOf(bufferArray[1])));
// // // }
// // // } catch (Exception e) {
// // // System.out.println(e.getMessage());
// // // }
// // // // Write here the code for reading from file
// // // // and printing the read records
// // // return persons;

// // // }
// // // }

// // // Scanner scan = new Scanner(System.in);
// // // System.out.println("File:");
// // // String file = scan.nextLine();
// // // System.out.println("Team:");
// // // String team = scan.nextLine();
// // // int games = 0;
// // // int wins=0;
// // // int loss=0;
// // // try(Scanner fileScan = new Scanner(Paths.get(file))){
// // // while(fileScan.hasNextLine()){
// // // String[] buffer = fileScan.nextLine().split(",");
// // // if(buffer[0].equals(team)||buffer[1].equals(team)){
// // // games++;
// // // }
// // // if(buffer[0].equals(team)){
// // // if(Integer.valueOf(buffer[2])>Integer.valueOf(buffer[3])){
// // // wins++;
// // // }
// // // else{
// // // loss++;
// // // }
// // // }
// // // else if (buffer[1].equals(team)){
// // // if(Integer.valueOf(buffer[3])>Integer.valueOf(buffer[2])){
// // // wins++;
// // // }
// // // else{
// // // loss++;
// // // }
// // // }
// // // }
// // // System.out.println("Games: "+games);
// // // System.out.println("Wins: "+wins);
// // // System.out.println("Losses: "+loss);
// // // }
// // // catch(Exception e){
// // // System.out.println(e.getMessage());
// // // }
// // /*
// // * To change this license header, choose License Headers in Project
// // Properties.
// // * To change this template file, choose Tools | Templates
// // * and open the template in the editor.
// // */

// // /**
// // *
// // * @author Fox
// // */
// // public class Counter {

// // private int startValue;

// // public Counter() {
// // this(1);
// // }

// // public Counter(int startValue) {
// // this.startValue = startValue;
// // }

// // public int value() {
// // return this.startValue;
// // }

// // public void increase() {
// // this.increaseBy(1);
// // }

// // public void decrease() {
// // this.decreaseBy(1);
// // }

// // public void increaseBy(int number) {
// // if (number < 0) {
// // return;
// // } else {
// // this.startValue = this.startValue + number;
// // }

// // }

// // public void decreaseBy(int number) {
// // if (number < 0) {
// // return;
// // } else {
// // this.startValue = this.startValue - number;
// // }
// // }
// // }
// // public void increase(int number) {
// // if (number < 0) {
// // return;
// // } else {
// // this.startValue = this.startValue + number;
// // }

// // }

// // public void decrease(int number) {
// // if (number < 0) {
// // return;
// // } else {
// // this.startValue = this.startValue - number;
// // }
// // }
// // public class NumbersFromAFile {

// // public static void main(String[] args) {
// // String a = "asd";
// // String b = a;
// // System.out.println(a);
// // System.out.println(b);
// // b = "zxc";
// // System.out.println(a);
// // System.out.println(b);
// // }
// // }

// // public class NumbersFromAFile {

// // public static void main(String[] args) {
// // Book a = new Book("asdasd");
// // Book b = new Book(a.getTitle());
// // a.setTitle(b.getTitle());
// // b.setTitle("jkljkl");
// // System.out.println(a.getTitle());
// // System.out.println(b.getTitle());
// // }
// // }

// // public class Person {

// // private String name;
// // private Pet pet;

// // public Person(String name, Pet pet) {
// // this.name = name;
// // this.pet = pet;
// // }

// // public Person(String name) {
// // this(name, new Pet("Toothless", "dragon"));
// // }

// // public Person() {
// // this("Lilo", new Pet("Stitch", "blue alien"));
// // }

// // @Override
// // public String toString() {
// // return this.name + ", has a friend called " + this.pet.getName() + "(" +
// // this.pet.getBreed() + ")";
// // }

// // }

// // public class Apartment {

// // private int rooms;
// // private int squares;
// // private int princePerSquare;

// // public Apartment(int rooms, int squares, int pricePerSquare) {
// // this.rooms = rooms;
// // this.squares = squares;
// // this.princePerSquare = pricePerSquare;
// // }
// // public boolean largerThan(Apartment compared){
// // if(this.squares>compared.squares){
// // return true;
// // }
// // else{
// // return false;
// // }
// // }
// // public int priceDifference(Apartment compare){
// // return
// //
// Math.abs(this.squares*this.princePerSquare-compare.squares*compare.princePerSquare);
// // }

// // }
// // public boolean moreExpensiveThan(Apartment compare){
// // return
// // this.squares*this.princePerSquare>compare.squares*compare.princePerSquare;
// // }

// // public class Book {

// // private String name;
// // private int publicationYear;

// // public Book(String name, int publicationYear) {
// // this.name = name;
// // this.publicationYear = publicationYear;
// // }

// // public String getName() {
// // return name;
// // }

// // public int getPublicationYear() {
// // return publicationYear;
// // }
// // public boolean equals(Object compare){
// // if(this==compare){
// // return true;
// // }
// // if(!(compare instanceof Book)){
// // return false;
// // }
// // Book temp = (Book)compare;
// //
// if(this.name.equals(temp.name)&&this.publicationYear==temp.publicationYear){
// // return true;
// // }
// // return false;
// // }

// // }

// // import java.util.ArrayList;
// // import java.util.Scanner;

// // public class Main {

// // public static void main(String[] args) {
// // Scanner scanner = new Scanner(System.in);
// // ArrayList<Book> books = new ArrayList<>();

// // while (true) {
// // System.out.println("Name (empty will stop):");
// // String name = scanner.nextLine();
// // if (name.isEmpty()) {
// // break;
// // }

// // System.out.println("Publication year:");
// // int publicationYear = Integer.valueOf(scanner.nextLine());
// // Book book = new Book(name, publicationYear);
// // if (books.contains(book)) {
// // System.out.println("The book is already on the list. Let's not add the
// same
// // book again.");
// // } else {
// // books.add(book);
// // }

// // }

// // // NB! Don't alter the line below!
// // System.out.println("Thank you! Books added: " + books.size());
// // }
// // }

// // public class SimpleDate {

// // private int day;
// // private int month;
// // private int year;

// // public SimpleDate(int day, int month, int year) {
// // this.day = day;
// // this.month = month;
// // this.year = year;
// // }

// // @Override
// // public String toString() {
// // return this.day + "." + this.month + "." + this.year;
// // }

// // public void advance(int howManyDays) {
// // if (this.day + howManyDays <= 30) {
// // this.day = this.day + howManyDays;
// // }
// // if (this.day + howManyDays > 30) {

// // this.day = this.day + howManyDays - 30;

// // if (this.month < 12) {
// // this.month = this.month + 1;
// // } else if (this.month == 12) {
// // this.month = 1;
// // this.year = this.year + 1;
// // }

// // }

// // }

// // public boolean before(SimpleDate compared) {
// // if (this.year < compared.year) {
// // return true;
// // }

// // if (this.year == compared.year && this.month < compared.month) {
// // return true;
// // }

// // if (this.year == compared.year && this.month == compared.month
// // && this.day < compared.day) {
// // return true;
// // }

// // return false;
// // }

// // }

// public class Money {

// private final int euros;
// private final int cents;

// public Money(int euros, int cents) {

// if (cents > 99) {
// euros = euros + cents / 100;
// cents = cents % 100;
// }

// this.euros = euros;
// this.cents = cents;
// }

// public int euros() {
// return this.euros;
// }

// public int cents() {
// return this.cents;
// }

// public Money plus(Money addition) {
// Money newMoney = new Money(addition.euros + this.euros, addition.cents +
// this.cents);
// return newMoney;
// }

// public Money minus(Money decrease) {
// int newEuros;
// int newCents;

// if (this.euros - decrease.euros < 0) {
// newEuros = 0;
// newCents = 0;
// } else {
// newEuros = this.euros - decrease.euros;
// if (this.cents - decrease.cents < 0) {
// if (newEuros > 0) {
// newEuros = newEuros - 1;
// if (this.cents == 0) {
// newCents = Math.abs(100 - decrease.cents);
// } else {
// newCents = Math.abs(this.cents - decrease.cents);
// }

// } else {
// newCents = 0;
// }

// } else {
// newCents = this.cents - decrease.cents;
// }
// }

// Money newMoney = new Money(newEuros, newCents);
// return newMoney;
// }

// public boolean lessThan(Money compare) {
// if (this.euros == compare.euros) {
// if (this.cents < compare.cents) {
// return true;
// } else {
// return false;
// }
// } else if (this.euros < compare.euros) {
// return true;
// } else {
// return false;
// }

// }

// public String toString() {
// String zero = "";
// if (this.cents < 10) {
// zero = "0";
// }

// return this.euros + "." + zero + this.cents + "e";
// }

// }
// private ArrayList<String> list = new ArrayList<>();

// public boolean isEmpty() {
// return list.isEmpty();
// }

// public void add(String value) {
// if (!this.list.contains(value)) {
// this.list.add(value);
// }

// }

// public ArrayList<String> values() {
// return this.list;
// }

// public String take() {
// String topMost = this.list.get(list.size() - 1);
// this.list.remove(list.size() - 1);
// return topMost;
// private ArrayList<Message> messages = new ArrayList<>();

// public MessagingService() {

// }

// public void add(Message message) {
// if (message.getContent().length() <= 280) {
// this.messages.add(message);
// }
// }

// public ArrayList<Message> getMessages() {
// return this.messages;
// }
// public String toString() {
// if (this.elements.size() == 0) {
// return "The collection " + this.name + " is empty.";
// }
// String output = "";
// String elementWord;
// if (this.elements.size() > 0) {
// if (this.elements.size() == 1) {
// elementWord = "element";
// } else {
// elementWord = "elements";
// }
// output = "The collection " + this.name + " has " + this.elements.size() + " "
// + elementWord + ":";
// for (String item : elements) {
// output = output + "\n" + item;
// }

// }
// return output;
// }

import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        for(int i =0; i<this.elements.size(); i++){
            if(this.elements.get(0).name.length()<this.elements.get(i+1))
        }
        
        return "";
    }

}
