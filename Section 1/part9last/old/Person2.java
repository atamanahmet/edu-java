public class Person2 {
    private String firstName;
    private int birthYear;

    public Person2(String firstName, int birthYear) {
        this.firstName = firstName;
        // this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    // public String getLastName() {
    // return this.lastName;
    // }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String toString() {
        return this.firstName + " (" + this.birthYear + ")";
    }
}