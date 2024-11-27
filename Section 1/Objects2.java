// import java.util.Arrays;

public class Objects2 {
    public static void main(String[] args) {

        Users ataman = new Users("Ahmet", "Turkish", 31, 17);
        System.out.println(ataman.toString());
        ataman.applyPassport();
        System.out.println(ataman.toString());
        System.out.println(ataman);
    }
}
