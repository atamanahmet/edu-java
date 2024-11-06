import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String name = scan.nextLine();
        System.out.println("What is your last name?");
        String lastname = scan.nextLine();
        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Make a username?");
        String username = scan.nextLine();
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        System.out.println("What country is that?");
        String country = scan.nextLine();

        scan.close();

        System.out.println(
                "\n\tFirst Name: " + name + "\n\tLast Name: " + lastname + "\n\tAge: " + age + "\n\tUsername: "
                        + username
                        + "\n\tCity: " + city + "\n\tCountry: " + country);
    }
}