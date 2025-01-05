package Airport.flightControl.ui;

import java.util.Collection;
import java.util.Scanner;

import Airport.flightControl.FlightControl;
// import Airport.flightControl.logic.*;

public class TextInterface implements UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public TextInterface(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
    }

    public void startAssetControl() {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x") || input.equals("X")) {
                break;
            }
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            }

        }
    }

    public void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scanner.nextLine());
        this.flightControl.addAirplane(id, capacity);
    }

    public void addFlight() {
        System.out.println("Give the airplane id: ");
        String airplaneID = scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String destinationID = scanner.nextLine();
        this.flightControl.addFlight(this.flightControl.getAirplane(airplaneID), departureID, destinationID);
    }

    public void startFlightControl() {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x") || input.equals("X")) {
                break;
            }
            switch (input) {
                case "1":
                    printAirplanes();

                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printAirplane();
                default:
                    break;
            }
        }
    }

    public void printAirplanes() {
        this.flightControl.getAirplanes().stream().forEach(airplane -> System.out.println(airplane));
    }

    public void printFlights() {
        this.flightControl.getFlights().stream().forEach(flight -> System.out.println(flight));
    }

    public void printAirplane() {
        System.out.println("Give the airplane id: ");
        String airplaneID = scanner.nextLine();
        System.out.println(this.flightControl.getAirplane(airplaneID));
    }
}
