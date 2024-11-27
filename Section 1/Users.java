import java.util.Arrays;

public class Users {

    private String name;
    private String nationality;
    private int age;
    private int seatNumber;
    private String[] passport = new String[3];
    private boolean hasPassport = false;

    public Users(String name, String nationality, int age, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
        this.hasPassport = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    public void setPassport(String[] passport) {
        this.passport = Arrays.copyOf(passport, passport.length);
    }

    public void applyPassport() {
        this.passport = new String[] { name, nationality, String.valueOf(age) };
        this.hasPassport = true;
    }

    public boolean hasPassport() {
        return this.hasPassport;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Nationality: " + nationality + "\n" + "Date of Birth: " + age + "\n"
                + "Seat Number: " + seatNumber + "\nPassport Info: " + Arrays.toString(passport);
    }
    // public Users(Users source) {
    // this.name = source.name;
    // this.nationality = source.nationality;
    // this.age = source.age;
    // this.seatNumber = source.seatNumber;
    // this.passport = new String[] { name, nationality, String.valueOf(age) };
    // }

}
