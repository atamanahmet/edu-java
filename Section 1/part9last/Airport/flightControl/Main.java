package Airport.flightControl;

import java.util.Scanner;

import Airport.flightControl.ui.TextInterface;

public class Main {
    public static void main(String[] args) {
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);

        TextInterface textInterface = new TextInterface(flightControl, scanner);
        textInterface.start();
    }
}
