public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    // public Person(String[] infos) {
    // this.passport = new String[3];
    // }
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Nationality: " + nationality + "\n" + "Date of Birth: " + dateOfBirth + "\n"
                + "Seat Number: " + seatNumber;
    }
}
