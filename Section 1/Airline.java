import java.util.Arrays;

public class Airline {

    Person[] people;

    Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        Person person = people[index];

        return new Person(person);
    }

    public void setPerson(Person person) {
        people[person.getSeatNumber() - 1] = new Person(person);
    }

    public String toString() {
        String buffer = "";
        for (int i = 0; i < people.length; i++) {
            buffer += "\n" + people[i].toString() + "\n";
        }
        return buffer;
    }
    // public String toString() {
    // return "Name: " + people.name + "\n" + "Nationality: " + this.nationality +
    // "\n" + "Date of Birth: " + dateOfBirth
    // + "\n"
    // + "Seat Number: " + seatNumber;
    // }
}
