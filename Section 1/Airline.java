import java.util.Arrays;

public class Airline {

    Person[] people = new Person[11];

    Airline(Person[] persons) {

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(persons[i]);
        }
    }

    public Person getPerson(int index) {
        return people[index];
    }

    public void setPerson(Person person) {

    }

    // public String toString() {
    // return "Name: " + people.name + "\n" + "Nationality: " + this.nationality +
    // "\n" + "Date of Birth: " + dateOfBirth
    // + "\n"
    // + "Seat Number: " + seatNumber;
    // }
}
