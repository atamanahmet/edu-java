import java.util.Arrays;

public class Airline {

    Airline(Person[] persons) {
        Person[] people = new Person[11];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(persons[i]);
        }
    }

    public Person getPerson(int index, Person[] person) {
        return person[index];
    }

    public void setPerson(Person person) {

    }

    // public String toString() {
    // return "Name: " + this.name + "\n" + "Nationality: " + this.nationality +
    // "\n" + "Date of Birth: " + dateOfBirth
    // + "\n"
    // + "Seat Number: " + seatNumber;
    // }
}
