
import Airport.FlightControl.FlightControl;
import Airport.FlightControl.ui.TextInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextInterface textUI = new TextInterface(flightControl, scanner);
        textUI.start();
    }
}