import java.util.Scanner;

public class Ifelseif {
    public static void main(String[] args) {
        // int grif = 100;
        // int raven = 500;

        // if (grif - raven >= 300) {
        // System.out.println("Griffindor 1st");
        // } else if (grif >= raven && grif - raven < 300) {
        // System.out.println("Griffindor 2th");
        // } else if (raven - grif <= 100 && raven - grif >= 0) {
        // System.out.println("Griffindor 3th");
        // } else if (raven - grif > 100) {
        // System.out.println("Griffindor 4th");
        // }
        // int temp = 20;
        // String forecast;
        // if (temp <= -1) {
        // forecast = "Freezing!";
        // } else if (temp > -1 && temp <= 10) {
        // forecast = "Chilly..!";
        // } else {
        // forecast = "Warm!";
        // }
        // System.out.println(forecast);

        // String color = "yellow";

        // switch (color) {
        // case "green":
        // System.out.println("It's green");
        // break;
        // case "yellow":
        // System.out.println("Yellow!");
        // break;
        // default:
        // System.out.println("donno");
        // }
        String day = "monday";
        // Scanner scan = new Scanner(System.in);

        System.out.println("Are you free on " + day + "? \n");

        // day = scan.nextLine();
        switch (day) {
            case "Monday":
            case "monday":
                System.out.println("Sorry, I have to stay at work late.");
                break;
            case "Tuesday":
            case "tuesday":
                System.out.println("It looks like I have meetings all day.");
                break;
            case "Wednesday":
            case "wednesday":
                System.out.println("I have a dentist appointment. Some other time!");
                break;
            case "Thursday":
            case "thursday":
                System.out.println("Sorry, thursday is date night!");
                break;
            case "Friday":
            case "friday":
                System.out.println("I'm free!!(almost..)");
                break;
            case "Saturday":
            case "saturday":
            case "sudnay":
            case "Sunday":
                System.out.println("I'm free!!");
                break;
            default:
                System.out.println("That's not a day..");

        }
    }
}