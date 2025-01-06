package FlightControl;

import java.util.Scanner;
import FlightControl.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextInterface textUI = new TextInterface(flightControl, scanner);
        textUI.start();
    }
}