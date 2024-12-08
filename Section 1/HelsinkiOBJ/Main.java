
// public class MainProgram {

// public static void main(String[] args) {
// test your class here
// Money a = new Money(10, 0);
// Money b = new Money(5, 0);
//
// Money c = a.plus(b);
//
// System.out.println(a); // 10.00e
// System.out.println(b); // 5.00e
// System.out.println(c); // 15.00e
//
// a = a.plus(c); // NB: a new Money object is created, and is placed "at the
// end of the strand connected to a"
//// the old 10 euros at the end of the strand disappears and the Java garbage
// collector takes care of it
//
// System.out.println(a); // 25.00e
// System.out.println(b); // 5.00e
// System.out.println(c); // 15.00e
// Money a = new Money(10, 0);
// Money b = new Money(3, 0);
// Money c = new Money(5, 0);
//
// System.out.println(a.lessThan(b)); // false
// // System.out.println(b.lessThan(c)); // true
// Money a = new Money(10, 0);
// Money b = new Money(3, 50);

// Money c = a.minus(b);

// System.out.println(a); // 10.00e
// System.out.println(b); // 3.50e
// System.out.println(c); // 6.50e

// c = c.minus(a); // NB: a new Money object is created, and is placed "at the
// end of the strand
// // connected to c"
// // the old 6.5 euros at the end of the strand disappears and the Java garbage
// // collector takes care of it

// System.out.println(a); // 10.00e
// System.out.println(b); // 3.50e
// System.out.println(c); // 0.00e
// Money firstMoneyObject = new Money(10, 0);
// Money secondMoneyObject = new Money(7, 40);
// Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
// System.out.println(firstMinusSecond.cents());
// }
// }

// public class Main {

//     public static void main(String[] args) {

//         // Try out your class here
//         SimpleCollection c = new SimpleCollection("characters");
//         System.out.println("Longest: " + c.longest());

//         c.add("magneto");
//         c.add("mystique");
//         c.add("phoenix");

//         System.out.println("Longest: " + c.longest());

//     }
// }

public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
    }
}
