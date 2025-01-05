package src;

import src.ui.UserInterface;
import src.ui.TextInterface;
import src.logic.ApplicationLogic;

public class MainProgram {
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
