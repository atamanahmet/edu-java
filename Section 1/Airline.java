import java.util.Arrays;

public class Airline {

    private Person[] people = new Person[11];

    Airline(Person[] person) {

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(person[i]);
        }
    }

    public Person getPerson(int index) {
        return people[index];
    }

    // public void setPerson(Person person) {
    // for (int i = 0; i < people.length; i++) {
    // if(i.equals(person.seatNumber-1)){

    // }
    // }
    // }

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
